@java.lang.Override
public void onQueryComplete() {
    tweetsAdapter = new ca.owenpeterson.twittegorize.listviewadapters.TweetsAdapter(getActivity(), tweets);
    tweetsListView.setAdapter(tweetsAdapter);
}