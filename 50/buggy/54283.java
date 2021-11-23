public void toMenu(javax.swing.JPanel from) {
    remove(from);
    add(menu);
    game.over();
    revalidate();
    repaint();
}