@java.lang.Override
public void onPixelUnselected() {
    pixelColorView.setBackgroundColor(android.graphics.Color.parseColor("#FFFFFFFF"));
    pixelColorNumber.setText("");
    pixelXText.setText("");
    pixelYText.setText("");
    pixelColorSeekbar.setEnabled(false);
}