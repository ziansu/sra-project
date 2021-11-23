private static java.util.List<ru.stqa.pft.addressbook.model.GroupData> generateGroups(int count) {
    java.util.List<ru.stqa.pft.addressbook.model.GroupData> groups = new java.util.ArrayList<ru.stqa.pft.addressbook.model.GroupData>();
    for (int i = 0; i < count; i++) {
        groups.add(new ru.stqa.pft.addressbook.model.GroupData().withName(java.lang.String.format("test %s", i)).withHeader(java.lang.String.format("header %s", i)).withFooter(java.lang.String.format("footer %s", i)));
    }
    return groups;
}