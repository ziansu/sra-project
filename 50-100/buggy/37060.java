@java.lang.Override
public void onItemSelected(android.widget.AdapterView<?> parentView, android.view.View selectedItemView, int position, long id) {
    if (position != 0) {
        de.dhbw.smar.helpers.LoginHelper.getInstance().setUsername(parentView.getItemAtPosition(position).toString());
        android.content.Intent startNewActivityOpen = new android.content.Intent(getBaseContext(), de.dhbw.smar.BarcodeScannerActivity.class);
        startActivityForResult(startNewActivityOpen, ActivityCodeHelper.ACTIVITY_BARCODE_REQUEST);
    }
}