void right() {
    if (((cardx) + 8) < (dctwidth)) {
        cardx += 8;
    }else {
        cardx = 0;
        cardy += 8;
    }
    repaint();
}