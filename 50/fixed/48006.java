private static void launchIntent(java.lang.String activity, java.lang.Class clazz, android.content.Context context) {
    android.content.Intent intent = new android.content.Intent(context, clazz);
    context.startActivity(intent);
}