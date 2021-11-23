public void onClick(android.content.DialogInterface dialog, int id) {
    editor.putBoolean("firstAppStart", false);
    editor.commit();
    createUser(androidId, userInput.getText().toString());
    setRecentReviews();
}