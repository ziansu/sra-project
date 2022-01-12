public void onPress(android.view.View view) {
    android.widget.TextView tv = ((android.widget.TextView) (findViewById(R.id.person_name)));
    java.lang.String deck = tv.getText().toString();
    java.lang.System.out.println("pressed");
    android.content.Intent intent = new android.content.Intent(this, com.example.oce.langlock.MainContentActivity.class);
    intent.putExtra("deckName", deck);
    startActivity(intent);
}