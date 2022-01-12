private android.app.AlertDialog removePinMsgDialog(final com.google.android.gms.maps.model.Marker marker) {
    android.app.AlertDialog.Builder removeMarkerbuilder = new android.app.AlertDialog.Builder(this);
    removeMarkerbuilder.setMessage(R.string.remove_pin_msg_question).setPositiveButton(R.string.yes, new android.content.DialogInterface.OnClickListener() {
        public void onClick(android.content.DialogInterface dialog, int id) {
            removePinMessage(marker);
        }
    }).setNegativeButton(R.string.no, new android.content.DialogInterface.OnClickListener() {
        public void onClick(android.content.DialogInterface dialog, int id) {
        }
    });
    return removeMarkerbuilder.create();
}