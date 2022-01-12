public com.github.iojjj.rcbs.RoundedCornersBackgroundSpan.Builder addTextPart(@android.support.annotation.NonNull
java.lang.CharSequence textPart, @android.support.annotation.ColorInt
int bgColor) {
    final com.github.iojjj.rcbs.BackgroundHolder backgroundHolder = new com.github.iojjj.rcbs.BackgroundHolder(bgColor, 0, 0);
    final android.util.Pair<java.lang.CharSequence, com.github.iojjj.rcbs.BackgroundHolder> pair = android.util.Pair.create(textPart, backgroundHolder);
    mTextParts.add(pair);
    return this;
}