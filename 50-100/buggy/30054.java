@java.lang.Override
public void onClick(android.view.View v) {
    android.graphics.drawable.ColorDrawable btnColor = ((android.graphics.drawable.ColorDrawable) (colourBtn.getBackground()));
    new com.pavelsikun.vintagechroma.ChromaDialog.Builder().initialColor(btnColor.getColor()).colorMode(ColorMode.RGB).indicatorMode(IndicatorMode.HEX).onColorSelected(new com.pavelsikun.vintagechroma.OnColorSelectedListener() {
        @java.lang.Override
        public void onColorSelected(@android.support.annotation.ColorInt
        int color) {
            scrapbookColour = color;
            colourBtn.setBackgroundColor(color);
        }
    }).create().show(getSupportFragmentManager(), "ChromaDialog");
}