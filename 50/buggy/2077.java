@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    com.borombo.mobileassignment.utils.LocationsManager.getInstance().delete(location);
    adapter.notifyItemRemoved(position);
    adapter.notifyDataSetChanged();
}