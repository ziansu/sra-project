public void viewAllList() {
    for (int i = 0; i < (noteData.size()); i++) {
        Note noteForView = noteData.elementAt(i);
        java.lang.System.out.println(((("note id : " + i) + "/t") + (noteForView.getContents())));
    }
}