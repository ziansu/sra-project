@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    android.content.Intent intent = new android.content.Intent(this, com.bladefrisch.discoveringtalk.DetailsActivity.class);
    intent.putExtra(com.bladefrisch.discoveringtalk.PhrasesActivity.T_KEY, items.get(position).getId());
    startActivity(intent);
}