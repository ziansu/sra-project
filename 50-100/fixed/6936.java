public static com.oasisfeng.android.ui.Dialogs.Builder buildAlert(final android.content.Context context, final java.lang.CharSequence title, final java.lang.CharSequence message) {
    final com.oasisfeng.android.ui.Dialogs.Builder builder = new com.oasisfeng.android.ui.Dialogs.Builder(context);
    builder.setCancelable(true);
    if (title != null)
        builder.setTitle(title);
    
    if (message != null)
        builder.setMessage(message);
    
    return builder;
}