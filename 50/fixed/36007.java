public static void start(@android.support.annotation.NonNull
android.content.Context context) {
    android.content.Intent intent = new android.content.Intent(context, de.jonasrottmann.realmbrowser.RealmFilesActivity.class);
    intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
    context.startActivity(intent);
}