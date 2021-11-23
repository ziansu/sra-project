public void onClick(android.content.DialogInterface dialog, int id) {
    dialog.cancel();
    if ((markerTemp) != null)
        markerTemp.remove();
    
}