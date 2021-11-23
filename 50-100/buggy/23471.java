@java.lang.Override
public void onHeaderClick(al.ahgitdevelopment.municion.Header header, int position) {
    super.onHeaderClick(header, position);
    if ((header.id) == (R.id.change_password)) {
        android.app.DialogFragment dialog = new al.ahgitdevelopment.municion.ChangePasswordDialog();
        dialog.show(getFragmentManager(), "ChangePasswordDialog");
    }
    if ((header.id) == (R.id.list_notifications)) {
        al.ahgitdevelopment.municion.Utils.loadNotificationData(this);
        android.app.DialogFragment dialog = new al.ahgitdevelopment.municion.ListNotificationDialog();
        dialog.show(getFragmentManager(), "ListNotificationDialog");
    }
}