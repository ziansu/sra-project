@java.lang.Override
public void onTap(org.osmdroid.views.overlay.OverlayItem item, android.content.ContentValues values) {
    markItem(values, false);
    if ((mListener) != null) {
        mListener.onShowDetail(this, values);
    }
}