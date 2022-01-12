@java.lang.Override
protected void onDestroy() {
    super.onDestroy();
    com.example.user.kchat01.ChatsActivity.dataList.clear();
    android.util.Log.d("DATALIST", ("roomnumber is:" + (ContactsActivity.roomnumber)));
    mSocket.off(ContactsActivity.roomnumber);
    ContactsActivity.roomnumber = "";
    recyclerView.getRecycledViewPool().clear();
    adapter.notifyDataSetChanged();
}