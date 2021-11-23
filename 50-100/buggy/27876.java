android.graphics.Bitmap render() {
    com.google.gson.Gson g = new com.google.gson.Gson();
    tgd.mindless.drone.weatherwidgetnumberone.redux.ThemesClass t = g.fromJson("{  \"name\": \"Default\",  \"type\": 1,  \"cloudCoverage\": {    \"day\": -16776961,    \"night\": -16777216,    \"location\": 0  },  \"properties\": [    {      \"name\": \"temperatureMax\",      \"dot\": {        \"color\": -1,        \"size\": 5      },      \"segment\": {        \"color\": -1,        \"width\": 50,        \"padding\": 2      }    }  ]}", tgd.mindless.drone.weatherwidgetnumberone.redux.ThemesClass.class);
    android.util.Log.i("themes", (((t.name) + "  ") + (t.properties[0].name)));
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