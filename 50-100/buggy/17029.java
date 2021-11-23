@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> arg0, android.view.View arg1, int arg2, long arg3) {
    android.content.Intent intent = new android.content.Intent(this, com.example.singforyou.ContentActivity.class);
    android.os.Bundle bundle = new android.os.Bundle();
    bundle.putString("PID", java.lang.String.valueOf(messagelist.get(position).getPostID()));
    intent.putExtras(bundle);
    startActivity(intent);
}