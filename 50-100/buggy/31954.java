private int findPhotoPositionInRecyclerView(java.lang.String photoDate, int photoPositionInDateList) {
    int photoDatePosition = 0;
    if (mMapKeyIsPhotoPositionValueIsPhotoDate.containsValue(photoDate)) {
        for (java.util.Map.Entry<java.lang.Integer, java.lang.String> entry : mMapKeyIsPhotoPositionValueIsPhotoDate.entrySet()) {
            if (entry.getValue().equals(photoDate)) {
                photoDatePosition = entry.getKey();
            }
        }
    }
    return (photoDatePosition + 1) + photoPositionInDateList;
}