@java.lang.Override
protected void onPostExecute(java.util.List<com.parse.ParseObject> objects) {
    if (objects == null) {
        android.widget.Toast.makeText(getApplicationContext(), "Error getting data, please try again later", Toast.LENGTH_SHORT).show();
        android.util.Log.i(edu.mit.printAtMIT.view.PrinterListActivity.TAG, "RefreshHashMapTask onPostExecute: Completed with an Error.");
    }
    setListViewData(objects);
    dialog.dismiss();
}