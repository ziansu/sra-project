@java.lang.Override
protected void onPostExecute(java.lang.String s) {
    android.util.Log.e("onpostexecute", s);
    android.content.Intent intent = new android.content.Intent(this, com.example.xcomputers.placelocator.SelectedPlaceActivity.class);
    intent.putExtra("json", s);
    intent.putExtra("lastLocation", phoneLocation);
    intent.putExtra("placeLocation", placeLocation);
    intent.putExtra("distance", distance);
    intent.putExtra("duration", duration);
    startActivity(intent);
    hideProgressDialog();
}