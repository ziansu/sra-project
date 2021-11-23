@java.lang.Override
public void onClick(android.view.View view) {
    android.widget.Toast.makeText(this, Post_Key, Toast.LENGTH_LONG).show();
    android.content.Intent intent = new android.content.Intent(this, com.rcoem.enotice.enotice_app.Single_Post.class);
    intent.putExtra("postkey", Post_Key);
    startActivity(intent);
}