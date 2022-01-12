private void changeFont(edu.utep.cs.cs4330.battleship.TextView textView) {
    android.graphics.Typeface typeface = android.graphics.Typeface.createFromAsset(getAssets(), getFontPath());
    textView.setTypeface(typeface);
}