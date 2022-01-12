@java.lang.Override
public boolean onLongPress(final android.view.MotionEvent e, final org.osmdroid.views.MapView mapView) {
    final android.content.DialogInterface.OnClickListener listener = new io.github.data4all.activity.AbstractMapActivity.MapPolygon.DialogClickListener();
    final android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(mapView.getContext());
    builder.setMessage(getString(R.string.deleteDialog)).setPositiveButton(getString(R.string.yes), listener).setNegativeButton(getString(R.string.no), listener).show();
    return true;
}