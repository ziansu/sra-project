android.graphics.Bitmap render() {
    renderWidgetBackground();
    renderGraphBackground();
    renderTimeBackground();
    renderLeftScaleBackground();
    renderRightScaleBackground();
    renderTimeText();
    renderScales();
    for (tgd.mindless.drone.weatherwidgetnumberone.redux.ThemesClass.Property p : _theme.properties) {
        renderProperty(p);
    }
    return _bmp;
}