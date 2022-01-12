@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    android.content.Intent intent = new android.content.Intent(this, com.benjaminearley.mysubs.StoryListActivity.class);
    startActivity(intent);
    finish();
}