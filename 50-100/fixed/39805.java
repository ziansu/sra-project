@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> adapterView, android.view.View view, int i, long l) {
    try {
        org.json.JSONObject jobject = array.getJSONObject(i);
        android.content.Intent intent = new android.content.Intent(this, com.plusonesoftwares.plusonesoftwares.jokesworld.DetailsViewActivity.class);
        intent.putExtra("Content", array.toString());
        intent.putExtra("Category", Title);
        intent.putExtra("SelectedIndex", java.lang.String.valueOf(i));
        startActivity(intent);
    } catch (org.json.JSONException e) {
        e.printStackTrace();
    }
}