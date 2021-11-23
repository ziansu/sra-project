public void setTourData(final net.tourbook.data.TourData tourData, final boolean isShowTour) {
    _tourDataList.clear();
    _tourDataList.add(tourData);
    isTourVisible = isShowTour & ((_tourDataList.size()) > 0);
}