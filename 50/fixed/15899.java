public void setTime(long time) {
    android.widget.TextView post_title = ((android.widget.TextView) (mView.findViewById(R.id.post_time)));
    post_title.setText(convertTime(time));
}