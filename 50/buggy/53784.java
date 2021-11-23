public static void showToast(android.content.Context context, int messageiId) {
    android.widget.Toast.makeText(context, context.getResources().getString(messageiId), Toast.LENGTH_SHORT);
}