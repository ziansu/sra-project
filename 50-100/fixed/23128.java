public void onClick(android.view.View v) {
    setResult(ca.ualberta.cs.lonelytwitter.RESULT_OK);
    java.lang.String text = bodyText.getText().toString();
    ca.ualberta.cs.lonelytwitter.Tweet latestTweet = new ca.ualberta.cs.lonelytwitter.NormalTweet(text);
    ca.ualberta.cs.lonelytwitter.ImportantTweet latestImportantTweet = new ca.ualberta.cs.lonelytwitter.ImportantTweet(text);
    tweets.add(latestTweet);
    adapter.notifyDataSetChanged();
    saveInFile();
}