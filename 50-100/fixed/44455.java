private void resetStandardTemplate(android.widget.RemoteViews contentView) {
    resetNotificationHeader(contentView);
    resetContentMargins(contentView);
    contentView.setViewVisibility(R.id.right_icon, View.GONE);
    contentView.setViewVisibility(R.id.title, View.GONE);
    contentView.setTextViewText(R.id.title, null);
    contentView.setViewVisibility(R.id.text, View.GONE);
    contentView.setTextViewText(R.id.text, null);
    contentView.setViewVisibility(R.id.text_line_1, View.GONE);
    contentView.setTextViewText(R.id.text_line_1, null);
}