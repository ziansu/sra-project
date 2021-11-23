public static void openActivity(android.app.Activity activity, boolean singlePhoto, int limitPickPhoto, int requestCode) {
    limitPickPhoto = (singlePhoto) ? 1 : limitPickPhoto > 0 ? limitPickPhoto : 1;
    android.content.Intent intent = new android.content.Intent(activity, com.tangxiaolv.telegramgallery.GalleryActivity.class);
    intent.putExtra(com.tangxiaolv.telegramgallery.GalleryActivity.SINGLE_PHOTO, singlePhoto);
    intent.putExtra(com.tangxiaolv.telegramgallery.GalleryActivity.LIMIT_PICK_PHOTO, limitPickPhoto);
    intent.putExtra(com.tangxiaolv.telegramgallery.GalleryActivity.HAS_CAMERA, false);
    activity.startActivityForResult(intent, requestCode);
}