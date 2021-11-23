public void setVWin(int pos, java.lang.String winner) {
    win = true;
    this.pos = pos;
    x1 = 85 + (pos * 115);
    y1 = 190;
    x2 = 85 + (pos * 115);
    y2 = 490;
    winLabel = winner;
    repaint();
}