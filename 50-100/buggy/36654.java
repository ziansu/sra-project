private void updateTextAlpha(int alpha) {
    int subsCount = subContainer.getChildCount();
    for (int i = 0; i < subsCount; i++) {
        subContainer.getChildAt(i).setBackgroundColor(android.graphics.Color.argb(alpha, 42, 42, 42));
    }
    tvTranslatedText.setBackgroundColor(android.graphics.Color.argb(alpha, 42, 42, 42));
}