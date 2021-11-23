private void openChat(android.view.View view) {
    to = chatButton.getText().toString();
    android.content.Intent intent = new android.content.Intent(this, pl.edu.uksw.prir.messenger.Chat.class);
    intent.putExtra("from", from);
    intent.putExtra("id", id);
    intent.putExtra("to", to);
    startActivity(intent);
}