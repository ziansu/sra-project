public void selectTile(editor.Tile t) {
    java.lang.System.out.println(t);
    current = t;
    list.linkToFront(t);
}