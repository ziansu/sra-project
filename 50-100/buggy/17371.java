private void setupExpList() {
    groupNames = new java.util.ArrayList<java.lang.String>();
    listItems = new java.util.HashMap<java.lang.String, java.util.List<java.lang.String>>();
    groupNames.add("Sort By");
    java.util.List<java.lang.String> sortTypes = new java.util.ArrayList<java.lang.String>();
    sortTypes.add("Header Files");
    sortTypes.add("Function Names");
    listItems.put(groupNames.get(0), sortTypes);
}