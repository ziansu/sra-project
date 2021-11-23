public static void start(de.jonasrottmann.realmbrowser.Context context, java.lang.String realmFileName) {
    android.content.Intent intent = new android.content.Intent(activity, de.jonasrottmann.realmbrowser.RealmBrowserActivity.class);
    intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
    intent.putExtra(de.jonasrottmann.realmbrowser.RealmBrowserActivity.EXTRAS_REALM_FILE_NAME, realmFileName);
    context.startActivity(intent);
}