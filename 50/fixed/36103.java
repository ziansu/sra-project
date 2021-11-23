private java.util.List<java.lang.String> asList(java.util.Set<java.lang.String> expectedSet) {
    java.util.List<java.lang.String> expectedList = new java.util.ArrayList<java.lang.String>();
    for (java.lang.String value : expectedSet) {
        expectedList.add(value);
    }
    return expectedList;
}