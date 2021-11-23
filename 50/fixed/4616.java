@java.lang.Override
protected void onPostExecute(byte[] result) {
    android.content.Intent intent = new android.content.Intent(getApplicationContext(), luc.edu.neuroscienceapp.activities.ImageChannelConversionActivity.class);
    luc.edu.neuroscienceapp.entities.Global.bytesBitmap = result;
    startActivity(intent);
    mProgressDialog.dismiss();
}