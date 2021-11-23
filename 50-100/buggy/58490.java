@java.lang.Override
public void onCreate(final android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    wpt = editor.getWptPt();
    net.osmand.plus.FavouritesDbHelper.FavoriteGroup group = getMyApplication().getFavorites().getGroup(wpt.category);
    if (group == null) {
        int defaultColor = getResources().getColor(R.color.gpx_color_point);
        color = wpt.getColor(defaultColor);
    }else
        color = group.color;
    
}