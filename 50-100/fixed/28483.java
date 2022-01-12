@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    java.lang.String filePath = data.get(position).getContentUri();
    android.content.Intent intent = new android.content.Intent(this, com.gzfgeh.note.RecordText.class);
    intent.putExtra("filePath", filePath);
    startActivity(intent);
}