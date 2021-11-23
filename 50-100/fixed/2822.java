private void loadPage() {
    com.example.android.interactivestory.model.Page page = mStory.getPage(0);
    android.graphics.drawable.Drawable drawable = android.support.v4.content.ContextCompat.getDrawable(this, R.drawable.page0);
    mImageView.setImageDrawable(drawable);
    java.lang.String pageText = page.getText();
    pageText = java.lang.String.format(pageText, mName);
    mTextView.setText(pageText);
    mChoice1.setText(page.getChoice1().getText());
    mChoice2.setText(page.getChoice2().getText());
}