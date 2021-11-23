@java.lang.Override
public void chooseHeight(java.lang.CharSequence text, int start, int end, int spanstartv, int v, android.graphics.Paint.FontMetricsInt fm, android.text.TextPaint paint) {
    if (v == 0) {
        fm.ascent = ((int) ((paint.ascent()) - (((float) (com.github.kubatatami.richedittext.styles.list.TopMarginSpan.VERTICAL_SPACING)) * (paint.density))));
    }else {
        fm.ascent = ((int) (paint.ascent()));
    }
}