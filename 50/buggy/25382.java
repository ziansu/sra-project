private static void setMarquee(android.widget.TextView textView) {
    textView.setSingleLine(true);
    textView.setSelected(true);
    textView.setEllipsize(TextUtils.TruncateAt.MARQUEE);
    textView.setMarqueeRepeatLimit((-1));
}