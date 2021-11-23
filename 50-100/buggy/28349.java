private void assertDeepEqualsStays(java.util.List<cz.muni.fi.pv168.project.Stay> expectedList, java.util.List<cz.muni.fi.pv168.project.Stay> actualList) {
    assertEquals(expectedList.size(), actualList.size());
    expectedList.sort(cz.muni.fi.pv168.project.StayManagerImplTest.idComparatorStay);
    actualList.sort(cz.muni.fi.pv168.project.StayManagerImplTest.idComparatorStay);
    for (int i = 0; i < (expectedList.size()); i++) {
        cz.muni.fi.pv168.project.Stay expected = expectedList.get(i);
        cz.muni.fi.pv168.project.Stay actual = actualList.get(i);
        assertDeepEquals(expected, actual);
    }
}