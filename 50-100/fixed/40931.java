public void onTap(com.totsp.crossword.view.Point e) {
    this.requestFocus();
    int box = com.totsp.crossword.shortyz.ShortyzApplication.RENDERER.findBoxNoScale(e);
    if (((boxes) != null) && (box < (boxes.length))) {
        selection.across = box;
    }
    this.render();
    if ((ctxListener) != null) {
        ctxListener.onTap(e);
    }
}