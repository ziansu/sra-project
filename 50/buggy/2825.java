public void outputEntryReport() {
    src.lists.Entry entry;
    for (java.lang.Object entry1 : entries) {
        entry = ((src.lists.Entry) (entry1));
        java.lang.System.out.println(entry.createTestEntryOutput());
    }
}