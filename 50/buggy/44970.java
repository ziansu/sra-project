public static android.content.Intent makeIntent(android.content.Context context) {
    android.content.Intent intent = new android.content.Intent(context, vandy.mooc.services.DownloadImagesBoundService.class);
    return intent;
}