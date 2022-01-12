public void onDeletePassword(java.lang.String id) {
    for (int i = 0; i < (passwords.size()); i++) {
        com.home.young.myPassword.adapter.PasswordListAdapter.PasswordItem passwordItem = passwords.get(i);
        if (passwordItem.password.getId().equals(id)) {
            passwords.remove(i);
            break;
        }
    }
    notifyDataSetChanged();
}