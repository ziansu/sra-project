@java.lang.Override
public void onContactDeleted(java.lang.String username) {
    friend_list.remove(username);
    adapter.notifyDataSetChanged();
}