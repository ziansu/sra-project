private java.util.ArrayList<com.mlab.PhotoSearch.ImageItem> getData() {
    final java.util.ArrayList<com.mlab.PhotoSearch.ImageItem> imageItems = new java.util.ArrayList<>();
    java.util.ArrayList<java.lang.String> thumbsIDs = new java.util.ArrayList<java.lang.String>();
    getThumbInfo(thumbsIDs);
    for (int i = 0; i < (thumbsIDs.size()); i++) {
        imageItems.add(new com.mlab.PhotoSearch.ImageItem(thumbsIDs.get(i), ("Image#" + i), ""));
    }
    return imageItems;
}