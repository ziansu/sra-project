public void updateShowItems() {
    li.zeitgeist.android.View showImagesView = findViewById(R.id.galleryBarShowImagesIcon);
    if (itemProvider.getHideImages()) {
        setViewBackground(showImagesView, true);
    }else {
        setViewBackground(showImagesView, false);
    }
    li.zeitgeist.android.View showVideosView = findViewById(R.id.galleryBarShowVideosIcon);
    if (itemProvider.getHideVideos()) {
        setViewBackground(showVideosView, true);
    }else {
        setViewBackground(showVideosView, false);
    }
}