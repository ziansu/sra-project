public void onClick(android.content.DialogInterface dialog, int which) {
    if (which < (available.size())) {
        add(available.get(which));
    }else {
        showBroadcastTileDialog();
    }
}