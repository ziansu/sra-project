@java.lang.Override
public void drawLeadingMargin(android.graphics.Canvas canvas, android.graphics.Paint paint, int x, int dir, int top, int baseline, int bottom, java.lang.CharSequence text, int start, int end, boolean first, android.text.Layout l) {
    if (first) {
        start = ((android.text.Spannable) (text)).getSpanStart(this);
        int index = getIndex(((android.text.Spannable) (text)), start);
        drawIndex(canvas, paint, x, dir, baseline, index);
    }
}