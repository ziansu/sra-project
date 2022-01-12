protected void back() {
    g.rectMode(funGUI.CENTER);
    g.noStroke();
    g.fill(outside);
    funGUI.PApplet.println(outside);
    backShape(x(), y(), w(), h());
    g.fill(inside);
    innerBackShape(x(), y(), iw(), ih());
    g.fill(0);
}