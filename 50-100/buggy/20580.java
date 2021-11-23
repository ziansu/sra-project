private void assertDeepEqualsCustomers(java.util.List<cz.muni.fi.pv168.project.Guest> expectedList, java.util.List<cz.muni.fi.pv168.project.Guest> actualList) {
    for (int i = 0; i < (expectedList.size()); i++) {
        cz.muni.fi.pv168.project.Guest expected = expectedList.get(i);
        cz.muni.fi.pv168.project.Guest actual = actualList.get(i);
        assertDeepEquals(expected, actual);
    }
}