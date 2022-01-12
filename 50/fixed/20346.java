public void testToast(java.lang.String text) {
    android.widget.Toast toast = android.widget.Toast.makeText(context, text, Toast.LENGTH_SHORT);
    toast.show();
}