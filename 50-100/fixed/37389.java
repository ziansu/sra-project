@java.lang.Override
public void onDetachedFromWindow() {
    super.onDetachedFromWindow();
    if (mContainsImages) {
        android.text.Spanned text = getText();
        com.facebook.react.views.text.TextInlineImageSpan[] spans = text.getSpans(0, text.length(), com.facebook.react.views.text.TextInlineImageSpan.class);
        for (com.facebook.react.views.text.TextInlineImageSpan span : spans) {
            span.onDetachedFromWindow();
        }
    }
}