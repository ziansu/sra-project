@java.lang.SuppressWarnings(value = "deprecation")
@android.annotation.SuppressLint(value = "NewApi")
public void setBackgroundColor(int color) {
    backgroundColor = color;
    android.graphics.drawable.GradientDrawable gradient = new android.graphics.drawable.GradientDrawable();
    gradient.setShape(GradientDrawable.RECTANGLE);
    gradient.setColor(backgroundColor);
    gradient.setCornerRadius(radius);
    if ((Build.VERSION.SDK_INT) >= (Build.VERSION_CODES.JELLY_BEAN)) {
        layoutBackground.setBackground(gradient);
    }else {
        layoutBackground.setBackgroundDrawable(gradient);
    }
    if (!(isProgressBarCreated)) {
        isBackgroundColorSetBeforeDraw = true;
    }
}