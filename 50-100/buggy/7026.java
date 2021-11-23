@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    android.widget.Toast.makeText(parent.getContext(), "OPENNN", Toast.LENGTH_LONG);
    com.lucianofabris.booklistingapp.Volume currentVolume = adapter.getItem(position);
    android.net.Uri webPageUri = android.net.Uri.parse(currentVolume.getInfoLink());
    android.content.Intent webIntent = new android.content.Intent(android.content.Intent.ACTION_VIEW, webPageUri);
    startActivity(webIntent);
}