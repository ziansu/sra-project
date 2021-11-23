@java.lang.Override
public void invalidateDrawable(android.graphics.drawable.Drawable drawable) {
    if (mContainsImages) {
        android.text.Spanned text = getText();
        com.facebook.react.views.text.TextInlineImageSpan[] spans = text.getSpans(0, text.length(), com.facebook.react.views.text.TextInlineImageSpan.class);
        for (com.facebook.react.views.text.TextInlineImageSpan span : spans) {
            if ((span.getDrawable()) == drawable) {
                invalidate();
            }
        }
    }
    super.invalidateDrawable(drawable);
}