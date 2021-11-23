public void addChapters(Manga m) {
    for (Chapter c : m.getAllChapters()) {
        row = new java.util.Vector<java.lang.String>(5);
        row.addElement(m.getMangaName());
        row.addElement(c.getChapterName());
        row.addElement(((c.getAllPages().size()) + ""));
        row.addElement("Downloading...");
        rowData.add(row);
    }
    fireTableDataChanged();
}