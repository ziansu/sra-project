@org.junit.Test
public void shouldFindYearByYear() {
    eu.waldonia.ipl.domain.Year y = new eu.waldonia.ipl.domain.Year(1999);
    yearRepository.save(y);
    eu.waldonia.ipl.domain.Year dbY = yearRepository.findYearByYear(1999);
    assertNotNull(dbY);
    assertEquals(y.year, dbY.year);
    assertEquals(y.id, dbY.id);
}