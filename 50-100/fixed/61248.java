@java.lang.Override
protected void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    if (data != null) {
        java.lang.String message = data.getExtras().getString(Constant.MESSAGE_OK);
        android.content.Intent intent = new android.content.Intent(this, fr.lokacar.locationvoiture.ui.vehicule.ListVehiculesActivity.class);
        intent.putExtra(Constant.MESSAGE_OK, message);
        setResult(Activity.RESULT_OK, intent);
        finish();
    }
}