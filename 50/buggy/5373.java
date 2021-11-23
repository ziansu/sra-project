@java.lang.Override
protected void onResume() {
    super.onResume();
    listView.setAdapter(new com.example.maks.database.adapters.MyAdapter(this, com.example.maks.database.App.getInstance().getDb()));
    myAdapter.notifyDataSetChanged();
}