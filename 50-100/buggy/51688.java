public void login(android.view.View view) {
    editor.putString("user_id", ((((android.widget.TextView) (findViewById(R.id.token))).getText()) + ""));
    editor.commit();
    finish();
    android.content.Intent intent = new android.content.Intent(getApplicationContext(), anonymousme.gitstar.Activities.Home.class);
    intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
    getApplicationContext().startActivity(intent);
}