public static ly.kite.photopicker.Photo[] getResultPhotos(android.content.Intent data) {
    android.os.Parcelable[] parcelables = data.getParcelableArrayExtra(ly.kite.photopicker.PhotoPicker.EXTRA_SELECTED_PHOTOS);
    ly.kite.photopicker.Photo[] photos = new ly.kite.photopicker.Photo[parcelables.length];
    java.lang.System.arraycopy(photos, 0, photos, 0, parcelables.length);
    return photos;
}