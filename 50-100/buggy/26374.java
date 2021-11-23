private boolean pushFigure(final int figure) {
    if (this.figures.elementAt(0).equals(0)) {
        this.figures.remove(0);
    }
    if ((this.figures.size()) < (com.alanbertadev.bigfinancekeyboard.BigFinanceKeyboard.MAX_CURSOR_POSITION)) {
        this.figures.push(figure);
        refreshUI();
        return true;
    }else {
        return false;
    }
}