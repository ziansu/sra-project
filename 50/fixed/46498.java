@java.lang.Override
public void onSuccess(java.lang.String pictureUrl) {
    this.pictureUrl = pictureUrl;
    downloadAndSetPicture(pictureUrl);
    setupImageZooming();
}