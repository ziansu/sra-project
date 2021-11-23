public android.view.View getView(int pos, android.view.View v, android.view.ViewGroup p) {
    android.widget.TextView view = new android.widget.TextView(this);
    view.setTextSize(25);
    if ((items) != null) {
        view.setText(items.get(pos).getText());
    }else {
        view.setText(pos);
    }
    return view;
}