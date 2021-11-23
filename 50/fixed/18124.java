@java.lang.Override
protected void onPostExecute(java.lang.Void aVoid) {
    mDialog.dismiss();
    mDialog = null;
    selectItemNavigation(R.id.nav_schedule);
}