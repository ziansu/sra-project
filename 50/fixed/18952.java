public void setContent(java.lang.String content) {
    this.content = content;
    android.widget.TextView tvContent = ((android.widget.TextView) (findViewById(R.id.content)));
    tvContent.setText(content);
}