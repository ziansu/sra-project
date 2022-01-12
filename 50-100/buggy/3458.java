@java.lang.Override
public void onPixelSelected(android.graphics.Point pixel, int color) {
    pixelColorView.setBackgroundColor(android.graphics.Color.rgb(color, color, color));
    pixelColorSeekbar.setProgress(color);
    pixelColorNumber.setText(java.lang.String.valueOf(color));
    pixelXText.setText(java.lang.String.valueOf(pixel.x));
    pixelYText.setText(java.lang.String.valueOf(pixel.y));
}