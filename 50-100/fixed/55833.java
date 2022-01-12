public void updateShowItems() {
    li.zeitgeist.android.View showImagesView = findViewById(R.id.galleryBarShowImagesIcon);
    if (itemProvider.getHideImages()) {
        setViewBackground(showImagesView, false);
    }else {
        setViewBackground(showImagesView, true);
    }
    li.zeitgeist.android.View showVideosView = findViewById(R.id.galleryBarShowVideosIcon);
    if (itemProvider.getHideVideos()) {
        setViewBackground(showVideosView, false);
    }else {
        setViewBackground(showVideosView, true);
    }
}