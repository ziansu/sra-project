@java.lang.Override
public void onItemSelected(android.net.Uri eventUri, int position) {
    android.content.Intent intent = new android.content.Intent(this, com.example.olivi.maphap.DetailActivity.class).setData(eventUri);
    startActivity(intent);
}