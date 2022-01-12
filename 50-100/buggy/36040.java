public static void scrollTo(double pos) {
    if ((pos < 0) || (pos > (elegit.treefx.CommitTreeScrollPane.numItems))) {
        elegit.treefx.CommitTreeScrollPane.vPos.setValue(elegit.treefx.CommitTreeScrollPane.DEFAULT_SCROLL_POS);
    }else {
        double ratio = pos / (elegit.treefx.CommitTreeScrollPane.numItems);
        double offset = (ratio >= 0.5) ? 1.0 / (elegit.treefx.CommitTreeScrollPane.numItems) : (-1.0) / (elegit.treefx.CommitTreeScrollPane.numItems);
        elegit.treefx.CommitTreeScrollPane.vPos.set((1 - (ratio + offset)));
    }
}