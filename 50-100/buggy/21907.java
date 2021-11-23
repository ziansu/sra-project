@java.lang.Override
public void run() {
    if ((currentY) > (startY + (swipeThreshold))) {
        ((com.main.toledo.gymtrackr.DetailActivity) (getActivity())).previous();
        removeListener();
    }
    if ((currentY) < (startY - (swipeThreshold))) {
        ((com.main.toledo.gymtrackr.DetailActivity) (getActivity())).next();
        removeListener();
    }
}