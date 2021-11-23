@java.lang.Override
public void onCreate(final android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    wpt = editor.getWptPt();
    net.osmand.plus.FavouritesDbHelper.FavoriteGroup group = getMyApplication().getFavorites().getGroup(wpt.category);
    if (group == null) {
        color = wpt.getColor(0);
    }else {
        color = group.color;
    }
}