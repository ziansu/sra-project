public void bindSermonToView(int position, android.view.View sermonView) {
    android.widget.TextView titleView = ((android.widget.TextView) (sermonView.findViewById(R.id.primary_text)));
    android.widget.TextView dateView = ((android.widget.TextView) (sermonView.findViewById(R.id.secondary_text)));
    com.appspot.shiloh_ranch.api.model.Sermon sermon = mSermons.get(position);
    java.lang.String sermonTitle = getSermonDisplayTitle(sermon);
    java.lang.String secondaryText = getSermonDisplaySubtitle(sermon);
    titleView.setText(android.text.Html.fromHtml(sermonTitle));
    dateView.setText(secondaryText);
}