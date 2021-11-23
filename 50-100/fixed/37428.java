public void setFont() {
    android.graphics.Typeface mtypeFace = android.graphics.Typeface.createFromAsset(getActivity().getResources().getAssets(), "futuralight.ttf");
    mQuoteView.setTypeface(mtypeFace);
    mtypeFace = android.graphics.Typeface.createFromAsset(getActivity().getResources().getAssets(), "futuralight.ttf");
    mAuthorView.setTypeface(mtypeFace);
}