@java.lang.SuppressWarnings(value = "deprecation")
public void setBarImage(int index) {
    android.widget.ImageView stringImageView = getStringImageView(getFretLayout(index), com.example.webprog26.guitarchords.guitar_chords_engine.helpers.FretViewsHelper.NOTE_IMAGE_VIEW_INDEX);
    stringImageView.getLayoutParams().width = ViewGroup.LayoutParams.MATCH_PARENT;
    stringImageView.requestLayout();
    stringImageView.setImageDrawable(getNotesResources().getDrawable(R.drawable.bar));
    stringImageView.bringToFront();
}