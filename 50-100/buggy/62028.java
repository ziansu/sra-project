public static void toaster(android.content.Context context, java.lang.CharSequence msg) {
    if (((context == null) || (msg == null)) || (msg.equals("")))
        return ;
    
    android.widget.Toast toast = android.widget.Toast.makeText(context, msg, Toast.LENGTH_SHORT);
    toast.setGravity(((android.view.Gravity.TOP) | (android.view.Gravity.CENTER)), 0, 50);
    toast.show();
}