@org.junit.Test
public void shouldFindAFranchiseByCode() {
    eu.waldonia.ipl.domain.Franchise f = new eu.waldonia.ipl.domain.Franchise("ABC");
    franchiseRepository.save(f);
    eu.waldonia.ipl.domain.Franchise dbF = franchiseRepository.findByCode("ABC");
    assertNotNull(dbF);
    assertEquals(f.code(), dbF.code());
    assertEquals(f.id, dbF.id);
}