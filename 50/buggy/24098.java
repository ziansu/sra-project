private void updateItemList(java.util.List<java.lang.String> titles) {
    if (titles != null)
        itemTitles = titles;
    
    android.widget.ArrayAdapter adapter = new android.widget.ArrayAdapter(getActivity(), android.R.layout.simple_list_item_1, android.R.id.text1, itemTitles);
    itemList.setAdapter(adapter);
}