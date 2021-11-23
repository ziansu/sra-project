public java.util.ArrayList<java.lang.String> getSelectedPhotoPaths() {
    java.util.ArrayList<java.lang.String> selectedPhotoPaths = new java.util.ArrayList(getSelectedItemCount());
    for (me.iwf.photopicker.entity.Photo photo : selectedPhotos) {
        selectedPhotoPaths.add(photo.getPath());
    }
    return selectedPhotoPaths;
}