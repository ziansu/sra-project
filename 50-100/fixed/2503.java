private void openKikUrl(android.content.Context context, java.lang.String url) {
    android.content.Intent intent = new android.content.Intent();
    intent.setAction(Intent.ACTION_VIEW);
    intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
    intent.setData(android.net.Uri.parse(url));
    if (canLaunchIntent(context, intent)) {
        context.startActivity(intent);
    }else {
        showKikInPlayStore(context);
    }
}