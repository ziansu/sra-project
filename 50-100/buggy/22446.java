@java.lang.Override
protected void onPostExecute(java.lang.Void aVoid) {
    super.onPostExecute(aVoid);
    hideProgressDialog();
    android.widget.Toast.makeText(activity, ("Excursion Inserted: " + (java.lang.String.valueOf(isSuccess))), Toast.LENGTH_SHORT).show();
    android.content.Intent intent = new android.content.Intent(activity, com.vegantravels.activities.ExcursionListActivity.class);
    intent.putExtra(StaticAccess.KEY_CRUISE_UNIQUE_ID, cruizeKey);
    startActivity(intent);
    finishTheActivity();
}