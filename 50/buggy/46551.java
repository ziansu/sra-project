@java.lang.Override
public void onPostExecute(org.fruct.oss.getssupplement.Model.BasicResponse response) {
    deleteMarker(getCurrentSelectedMarker());
    android.widget.Toast.makeText(getApplicationContext(), "TODO: delete marker from API", Toast.LENGTH_SHORT).show();
}