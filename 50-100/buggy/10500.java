public void setTagline() {
    if ((mMovie.getTagline().length()) != 0) {
        ((android.widget.TextView) (mRootView.findViewById(R.id.banner_title))).setText((("\"" + (mMovie.getTagline())) + "\""));
    }
}