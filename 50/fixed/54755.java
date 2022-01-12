protected void onPostExecute(akhil.alltrans.AppListFragment.StableArrayAdapter adapter) {
    if (adapter != null)
        listview.setAdapter(adapter);
    
    dialog.dismiss();
}