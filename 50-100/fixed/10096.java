private void assertDeepEqualsGuests(java.util.List<cz.muni.fi.pv168.project.Guest> expectedList, java.util.List<cz.muni.fi.pv168.project.Guest> actualList) {
    expectedList.sort(cz.muni.fi.pv168.project.StayManagerImplTest.idComparatorGuest);
    actualList.sort(cz.muni.fi.pv168.project.StayManagerImplTest.idComparatorGuest);
    assertEquals(expectedList, actualList);
    for (int i = 0; i < (expectedList.size()); i++) {
        cz.muni.fi.pv168.project.Guest expected = expectedList.get(i);
        cz.muni.fi.pv168.project.Guest actual = actualList.get(i);
        assertDeepEquals(expected, actual);
    }
}