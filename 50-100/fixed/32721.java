public void setTourData(final java.util.ArrayList<net.tourbook.data.TourData> tourDataList, final boolean isShowTour) {
    _tourDataList.clear();
    if (tourDataList != null) {
        _tourDataList.addAll(tourDataList);
    }
    isTourVisible = isShowTour && ((_tourDataList.size()) > 0);
}