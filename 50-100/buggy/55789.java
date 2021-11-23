public void toast(java.lang.String text, int duration) {
    android.widget.Toast toast = new android.widget.Toast(getContext());
    android.widget.TextView view = new android.widget.TextView(getContext());
    view.setPadding(10, 10, 10, 10);
    view.setBackgroundColor(android.graphics.Color.rgb(180, 180, 180));
    view.setTextColor(Color.BLACK);
    view.setText(text);
    toast.setDuration(Toast.LENGTH_SHORT);
    toast.setView(view);
    toast.show();
}