@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    android.content.Intent i = new android.content.Intent(getBaseContext(), com.example.thomas.justchat.justchat.controller.ChatActivity.class);
    i.putExtra("item", adapter.getItem(position));
    i.putExtra("username", username);
    i.putExtra("isPendingIntent", false);
    startActivity(i);
}