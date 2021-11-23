public void onClick(android.content.DialogInterface dialog, int whichButton) {
    setValue(getValue(numberPicker));
    dialog.dismiss();
    layout.removeView(numberPicker);
    onClose(true);
}