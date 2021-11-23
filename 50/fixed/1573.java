public java.util.ArrayList<java.lang.String> getSelectedPhotoPaths() {
    java.util.ArrayList<java.lang.String> selectedPhotoPaths = new java.util.ArrayList(getSelectedItemCount());
    for (java.lang.String photo : selectedPhotos) {
        selectedPhotoPaths.add(photo);
    }
    return selectedPhotoPaths;
}