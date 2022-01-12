public void sendMessage(android.view.View view) {
    android.content.Intent intent = new android.content.Intent(view.getContext(), cs6242.westga.edu.patrickdeanactivities.DisplayMessageActivity.class);
    android.widget.EditText editText = ((android.widget.EditText) (findViewById(R.id.edit_message)));
    java.lang.String message = editText.getText().toString();
    intent.putExtra(cs6242.westga.edu.patrickdeanactivities.MainActivity.EXTRA_MESSAGE, message);
    startActivity(intent);
}