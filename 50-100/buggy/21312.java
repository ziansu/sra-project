@org.junit.Test
public void shouldFindAFranchiseByCode() {
    eu.waldonia.ipl.domain.Franchise f = new eu.waldonia.ipl.domain.Franchise("ABC");
    franchiseRepository.save(f);
    eu.waldonia.ipl.domain.Franchise dbF = franchiseRepository.findByCode("ABC");
    org.junit.Assert.assertNotNull(dbF);
    org.junit.Assert.assertEquals(f.code(), dbF.code());
    org.junit.Assert.assertEquals(f.id, dbF.id);
}