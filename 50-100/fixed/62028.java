public static android.widget.Toast toaster(android.content.Context context, java.lang.CharSequence msg) {
    if (((context == null) || (msg == null)) || (msg.equals("")))
        return null;
    
    android.widget.Toast toast = android.widget.Toast.makeText(context, msg, Toast.LENGTH_SHORT);
    toast.setGravity(((android.view.Gravity.TOP) | (android.view.Gravity.CENTER)), 0, 50);
    toast.show();
    return toast;
}