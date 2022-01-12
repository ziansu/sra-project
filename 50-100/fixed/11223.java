@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    if ((mCallback) == null) {
        android.util.Log.e(net.exclaimindustries.geohashdroid.fragments.MapTypeDialogFragment.DEBUG_TAG, "There's no callback set!");
        return ;
    }
    dialog.dismiss();
    switch (which) {
        case 0 :
            mCallback.mapTypeSelected(GoogleMap.MAP_TYPE_NORMAL);
            break;
        case 1 :
            mCallback.mapTypeSelected(net.exclaimindustries.geohashdroid.fragments.MapTypeDialogFragment.MAP_STYLE_NIGHT);
            break;
        case 2 :
            mCallback.mapTypeSelected(GoogleMap.MAP_TYPE_HYBRID);
            break;
        case 3 :
            mCallback.mapTypeSelected(GoogleMap.MAP_TYPE_TERRAIN);
    }
}