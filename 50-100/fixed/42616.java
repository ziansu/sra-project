@java.lang.Override
protected void onPostExecute(java.lang.Boolean success) {
    if (success) {
        com.wuerth.osua.DatabaseAdapter databaseAdapter = new com.wuerth.osua.DatabaseAdapter(mainActivity);
        userList = databaseAdapter.getAllUsers(searchQuery);
        android.widget.ListAdapter adapter = new com.wuerth.osua.Fragment_UserList.myListAdapter();
        listView.setAdapter(adapter);
        progressBar.setVisibility(View.INVISIBLE);
    }else {
    }
    userListRefresh.setRefreshing(false);
    super.onPostExecute(success);
}