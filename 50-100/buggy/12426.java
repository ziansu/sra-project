@java.lang.Override
public void onClick(android.view.View v) {
    for (com.example.liwaihing.multiuseronlinemaps.UserPosition u : userPositionList) {
        if ((u.getUserPosition(name)) != null) {
            marker.remove();
        }
    }
    dbHelper.removeSharingUser(dbHelper.getGoogleID(), name);
    dbHelper.removeSharingUser(name, dbHelper.getGoogleID());
    layout_pos.setVisibility(View.GONE);
    if ((polyline) != null) {
        polyline.remove();
    }
}