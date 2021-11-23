public void onClick(android.content.DialogInterface dialog, int whichButton) {
    dialog.dismiss();
    layout.removeView(numberPicker);
    onClose(false);
}