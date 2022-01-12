public void setBotLineLenDp(int lenDp) {
    this.botLineLen = dpToPx(lenDp);
    initSize();
    invalidate();
}