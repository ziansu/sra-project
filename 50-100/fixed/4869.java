public void onPress(android.view.View view) {
    android.widget.TextView tv = ((android.widget.TextView) (view.findViewById(R.id.person_name)));
    java.lang.String deck = tv.getText().toString();
    android.content.Intent intent = new android.content.Intent(this, com.example.oce.langlock.MainContentActivity.class);
    intent.putExtra("deckName", deck);
    startActivity(intent);
}