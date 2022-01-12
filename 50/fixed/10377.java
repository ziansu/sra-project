public void setBotLineLenDp(float lenDp) {
    this.botLineLen = dpToPx(lenDp);
    initSize();
    invalidate();
}