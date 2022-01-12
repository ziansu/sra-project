public void search(android.view.View view) {
    android.content.Intent intent = new android.content.Intent(this, com.nsl.lostandfound.SearchLoss.class);
    android.os.Bundle extras = getIntent().getExtras();
    java.lang.String email = extras.getString("email");
    java.lang.String name = extras.getString("name");
    intent.putExtra("name", name);
    intent.putExtra("email", "hello");
    startActivity(intent);
}