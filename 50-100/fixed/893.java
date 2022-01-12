@java.lang.Override
public void onClick(android.view.View v) {
    switch (v.getId()) {
        case R.id.bubble_delete :
            final android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(mMapView.getContext());
            builder.setMessage(activity.getString(R.string.deleteDialog)).setPositiveButton(activity.getString(R.string.yes), this).setNegativeButton(activity.getString(R.string.no), this).show();
            break;
        case R.id.bubble_edit :
            this.editElement();
            close();
            break;
        default :
            break;
    }
}