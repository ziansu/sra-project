@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    java.util.HashMap<java.lang.String, java.lang.Object> item = ((java.util.HashMap<java.lang.String, java.lang.Object>) (lv.getItemAtPosition(position)));
    android.content.Intent intent = new android.content.Intent(this, com.example.selection_test1.PersonalProfileReview.class);
    intent.putExtra("PERSON", item);
    startActivity(intent);
}