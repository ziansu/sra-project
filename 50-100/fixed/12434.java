private void setListView() {
    listView = findView(R.id.lv_main_providers_list);
    mAdapter = new com.pictureit.noambaroz.beautyapp.helper.MainProviderListAdapter(this, android.R.layout.simple_list_item_1, new java.util.ArrayList<com.pictureit.noambaroz.beautyapp.data.Beautician>());
    listView.setAdapter(mAdapter);
    listView.setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener() {
        @java.lang.Override
        public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
            com.pictureit.noambaroz.beautyapp.BeauticianUtil.openBeauticianInNewActivity(com.pictureit.noambaroz.beautyapp.MainActivity.this, mAdapter.getItem(position));
        }
    });
}