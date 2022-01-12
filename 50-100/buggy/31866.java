public void setTextColor(final boolean val) {
    android.widget.TextView view = ((android.widget.TextView) (this.findViewById(R.id.txtView_status_val)));
    int greenColor = getResources().getColor(R.color.colorGreen);
    int redColor = getResources().getColor(R.color.colorRed);
    if (val) {
        view.setText("Connected");
        view.setTextColor(greenColor);
        socketIsBound = true;
    }else {
        view.setText("Disconnected");
        view.setTextColor(redColor);
        socketIsBound = false;
    }
}