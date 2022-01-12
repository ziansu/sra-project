@java.lang.Override
protected void onPostExecute(java.lang.Void aVoid) {
    super.onPostExecute(aVoid);
    hideProgressDialog();
    android.content.Intent intent = new android.content.Intent(activity, com.vegantravels.activities.ExcursionListActivity.class);
    intent.putExtra(StaticAccess.KEY_CRUISE_UNIQUE_ID, cruizeKey);
    startActivity(intent);
    finishTheActivity();
}