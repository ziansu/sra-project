@java.lang.Override
public void onQueryComplete() {
    tweetsAdapter = new ca.owenpeterson.twittegorize.listviewadapters.TweetsAdapter(context, tweets);
    tweetsListView.setAdapter(tweetsAdapter);
}