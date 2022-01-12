public void onSelectDone(java.util.List<com.ln.images.models.LocalMedia> medias) {
    java.util.ArrayList<java.lang.String> images = new java.util.ArrayList<>();
    for (com.ln.images.models.LocalMedia media : medias) {
        images.add(media.getPath());
    }
    onResult(images);
}