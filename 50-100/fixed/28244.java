@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> adapterView, android.view.View view, int i, long l) {
    com.example.android.hawkpark01.models.HomeLotDB selectedLot = homeLotItemsList.get(i);
    java.lang.String name = selectedLot.getName();
    android.content.Intent intent = new android.content.Intent(this, com.example.android.hawkpark01.LotActivity.class);
    intent.putExtra(com.example.android.hawkpark01.utils.Utils.ID_KEY, userId);
    intent.putExtra(com.example.android.hawkpark01.utils.Utils.LOT_KEY, name);
    startActivity(intent);
}