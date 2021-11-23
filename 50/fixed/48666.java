@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    android.content.Intent intent = new android.content.Intent(this, com.example.programmeerproject.PinboardActivity.class);
    startActivity(intent);
}