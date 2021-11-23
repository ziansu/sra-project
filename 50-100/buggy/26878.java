private android.os.Message makeReplyMessage(android.net.Uri pathToImageFile, android.net.Uri url) {
    android.os.Message message = android.os.Message.obtain();
    android.os.Bundle bundle = new android.os.Bundle();
    bundle.putParcelable(vandy.mooc.services.DownloadImageService.IMAGE_URL, url);
    boolean isSuccess = (android.app.Activity.RESULT_OK) == (vandy.mooc.services.DownloadImageService.getResultCode(message));
    if (isSuccess) {
        bundle.putParcelable(vandy.mooc.services.DownloadImageService.IMAGE_PATHNAME, pathToImageFile);
    }
    message.setData(bundle);
    return message;
}