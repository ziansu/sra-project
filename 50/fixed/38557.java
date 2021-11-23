public com.github.jorgecastilloprz.FABProgressCircle withArcColor(@android.support.annotation.ColorInt
int arcColor) {
    this.arcColor = arcColor;
    if ((progressArc) != null) {
        progressArc.setArcColor(arcColor);
    }
    return this;
}