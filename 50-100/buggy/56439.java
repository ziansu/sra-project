@org.junit.Test
public void shouldFindYearByYear() {
    eu.waldonia.ipl.domain.Year y = new eu.waldonia.ipl.domain.Year(1999);
    yearRepository.save(y);
    eu.waldonia.ipl.domain.Year dbY = yearRepository.findYearByYear(1999);
    org.junit.Assert.assertNotNull(dbY);
    org.junit.Assert.assertEquals(y.year, dbY.year);
    org.junit.Assert.assertEquals(y.id, dbY.id);
}