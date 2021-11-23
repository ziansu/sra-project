@java.lang.Override
public void onDetachedFromWindow() {
    super.onDetachedFromWindow();
    if ((mContainsImages) && ((getText()) instanceof android.text.Spanned)) {
        android.text.Spanned text = ((android.text.Spanned) (getText()));
        com.facebook.react.views.text.TextInlineImageSpan[] spans = text.getSpans(0, text.length(), com.facebook.react.views.text.TextInlineImageSpan.class);
        for (com.facebook.react.views.text.TextInlineImageSpan span : spans) {
            span.onDetachedFromWindow();
        }
    }
}