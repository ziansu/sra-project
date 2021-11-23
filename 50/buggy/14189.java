void right() {
    if ((cardx) < (dctwidth)) {
        cardx += 8;
    }else {
        cardx = 0;
        cardy += 8;
    }
    repaint();
}