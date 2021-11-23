public void resizeBubble(int width) {
    remove(textPane);
    textPane = makeTextPane(textPane.getBackground(), leftJustified, width);
    textPane.setComponentPopupMenu(popup);
    add(textPane);
}