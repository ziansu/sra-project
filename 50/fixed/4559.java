@java.lang.Override
public void onClick(android.view.View v) {
    android.content.Intent intent = new android.content.Intent(this, com.example.david_2.petshop.Record.class);
    startActivity(intent);
    adapter.notifyDataSetChanged();
}