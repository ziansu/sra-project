public static fi.tamk.jpak.pixpainter.utils.Pixel[][] getPreviousStateFromHistory() {
    if (((fi.tamk.jpak.pixpainter.utils.PixelGridState.history) != null) && ((fi.tamk.jpak.pixpainter.utils.PixelGridState.history.size()) > 0)) {
        if (((fi.tamk.jpak.pixpainter.utils.PixelGridState.historyCursor) + 1) < (fi.tamk.jpak.pixpainter.utils.PixelGridState.history.size())) {
            fi.tamk.jpak.pixpainter.utils.PixelGridState.historyCursor = (fi.tamk.jpak.pixpainter.utils.PixelGridState.historyCursor) + 1;
            return fi.tamk.jpak.pixpainter.utils.PixelGridState.history.get(fi.tamk.jpak.pixpainter.utils.PixelGridState.historyCursor);
        }
    }
    return null;
}