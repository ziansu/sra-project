public static fi.tamk.jpak.pixpainter.utils.Pixel[][] getNextStateFromHistory() {
    if (((fi.tamk.jpak.pixpainter.utils.PixelGridState.history) != null) && ((fi.tamk.jpak.pixpainter.utils.PixelGridState.history.size()) > 0)) {
        if ((fi.tamk.jpak.pixpainter.utils.PixelGridState.historyCursor) > 0) {
            (fi.tamk.jpak.pixpainter.utils.PixelGridState.historyCursor)--;
            return fi.tamk.jpak.pixpainter.utils.PixelGridState.history.get(fi.tamk.jpak.pixpainter.utils.PixelGridState.historyCursor);
        }
    }
    return null;
}