@java.lang.Override
public void afterTextChanged(android.text.Editable editable) {
    tweetText = ((tweet.getText()) + " ") + (selectedUrl);
    int charsRemaining = (com.transcendentlabs.xcerpt.ShareActivity.CHAR_LIMIT) - (tweet.getText().length());
    characterCount.setText(java.lang.Integer.toString(charsRemaining));
    if (charsRemaining >= 0) {
        tweetButton.setEnabled(true);
        characterCount.setTextColor(Color.BLACK);
    }else {
        tweetButton.setEnabled(false);
        characterCount.setTextColor(Color.RED);
    }
}