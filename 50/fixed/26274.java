public static void showText(android.content.Context context, java.lang.String message) {
    if (context != null) {
        android.widget.Toast.makeText(context.getApplicationContext(), message, Toast.LENGTH_SHORT).show();
    }
}