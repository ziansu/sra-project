@java.lang.Override
public void onClick(android.view.View v) {
    java.lang.String color = ColorsUtil.Util.rgbToHex(COLOR_PICKER.getRed(), COLOR_PICKER.getGreen(), COLOR_PICKER.getBlue());
    ((android.widget.Button) (view)).setText(color);
    view.setBackgroundColor(android.graphics.Color.parseColor(color));
    COLOR_PICKER.dismiss();
}