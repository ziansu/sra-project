@java.lang.Override
public void setTypeface(final android.graphics.Typeface tf) {
    _paint.setTypeface(tf);
    adjustTextSize();
    super.setTypeface(tf);
}