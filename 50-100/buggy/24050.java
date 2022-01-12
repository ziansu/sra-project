private void initRecycler() {
    android.support.v7.widget.RecyclerView items = ((android.support.v7.widget.RecyclerView) (findViewById(R.id.shopping_list_recycler)));
    com.jjacobson.groupshop.shoppinglist.list.ShoppingListAdapter adapter = new com.jjacobson.groupshop.shoppinglist.list.ShoppingListAdapter(com.jjacobson.groupshop.shoppinglist.item.Item.class, R.layout.row_items_list, com.jjacobson.groupshop.shoppinglist.list.ShoppingListHolder.class, database);
    android.support.v7.widget.DividerItemDecoration divider = new android.support.v7.widget.DividerItemDecoration(items.getContext(), android.support.v7.widget.DividerItemDecoration.VERTICAL);
    items.addItemDecoration(divider);
    items.setLayoutManager(new android.support.v7.widget.LinearLayoutManager(this));
    items.setAdapter(adapter);
}