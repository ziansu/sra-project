protected void onPostExecute(akhil.alltrans.AppListFragment.StableArrayAdapter adapter) {
    listview.setAdapter(adapter);
    dialog.dismiss();
}