public static void start(de.jonasrottmann.realmbrowser.Context context, int realmModelIndex, java.lang.String realmFileName) {
    android.content.Intent intent = new android.content.Intent(context, de.jonasrottmann.realmbrowser.RealmBrowserActivity.class);
    intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
    intent.putExtra(de.jonasrottmann.realmbrowser.RealmBrowserActivity.EXTRAS_REALM_MODEL_INDEX, realmModelIndex);
    intent.putExtra(de.jonasrottmann.realmbrowser.RealmBrowserActivity.EXTRAS_REALM_FILE_NAME, realmFileName);
    context.startActivity(intent);
}