@java.lang.Override
public void onSuccess(java.lang.String pictureUrl) {
    downloadAndSetPicture(pictureUrl);
    setupImageZooming();
}