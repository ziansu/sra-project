@java.lang.Override
public void showUsers(java.util.List<com.example.neven.dbflowapp.models.Users> listUsers) {
    com.example.neven.dbflowapp.adapters.AllUsersAdapter adapter = new com.example.neven.dbflowapp.adapters.AllUsersAdapter(listUsers);
    recyclerView.setAdapter(adapter);
}