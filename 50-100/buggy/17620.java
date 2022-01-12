@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    java.lang.String pairName = MainActivity.API_COLLECTION.get(position).getPAIR_NAME();
    android.util.Log.d(com.example.admin.cryptowatcher.HomeActivity.TAG, (pairName + " - got this name bitch"));
    android.content.Intent detailScreen = new android.content.Intent(this, com.example.admin.cryptowatcher.DetailActivity.class);
    detailScreen.putExtra("pairName", pairName);
    startActivity(detailScreen);
}