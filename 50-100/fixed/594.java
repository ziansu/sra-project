@java.lang.Override
public void onClick(android.view.View v) {
    int val = mPreferences.getSaveStoredByKey(SJLPreferences.KEY_ORDER_TYPE);
    java.lang.String title = getString(R.string.title_booking_options);
    if (val == (rsantillanc.sanjoylao.util.SJLPreferences.INT_DEFAULT_VALUE))
        rsantillanc.sanjoylao.custom.dialog.SJLAlertDialog.showTypeBookAlert(this, title);
    else {
        android.content.Intent popup = new android.content.Intent(getApplicationContext(), rsantillanc.sanjoylao.view.popup.DetailsOptionsPopup.class);
        startActivity(popup);
        android.widget.Toast.makeText(ctx, "¡Agregado!", Toast.LENGTH_LONG).show();
    }
}