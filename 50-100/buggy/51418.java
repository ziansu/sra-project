private void loadPage() {
    interactivestory.joshuadavid.com.interactivestory.model.Page page = mStory.getPage(0);
    android.graphics.drawable.Drawable drawable = getResources().getDrawable(page.getImageId());
    mImageView.setImageDrawable(drawable);
    java.lang.String pageText = page.getText();
    pageText = java.lang.String.format(pageText, mName);
    mTextView.setText(page.getText());
    mChoice1.setText(page.getChoice1().getText());
    mChoice2.setText(page.getChoice2().getText());
}