private int findPhotoPositionInRecyclerView(java.lang.String photoDate, int photoPositionInDateList) {
    int photoDatePosition = 0;
    for (java.util.Map.Entry<java.lang.Integer, java.lang.String> entry : mMapKeyIsPhotoPositionValueIsPhotoDate.entrySet()) {
        if (photoDate.contains(entry.getValue())) {
            photoDatePosition = entry.getKey();
        }
    }
    return (photoDatePosition + 1) + photoPositionInDateList;
}