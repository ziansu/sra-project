protected void updateList() {
    update();
    tingeltangel.core.Book book = mainFrame.getBook();
    list.removeAll();
    for (int i = 0; i < (book.getSize()); i++) {
        list.add(new tingeltangel.gui.IndexListEntry(book.getEntry(i), this));
    }
    java.awt.Dimension size = mainFrame.getSize();
    mainFrame.pack();
    mainFrame.setSize(size);
}