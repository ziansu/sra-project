@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    android.content.Intent intent = new android.content.Intent(getBaseContext(), a15s.android.datamatiker.mini_projekt1.TestWaresList.class);
    intent.putExtra(ShoppingListDetail.EXTRA_LISTNO, list_id);
    intent.putExtra(TestWaresList.EXTRA_STORE_ID, ((int) (id)));
    startActivity(intent);
}