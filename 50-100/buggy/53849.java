@java.lang.Override
public void success(java.util.List<cs499.knowsie.data.Tweet> tweets, retrofit.client.Response response) {
    updateList.addAll(tweets);
    updateListAdapter.notifyDataSetChanged();
    tweetMaxID = tweets.get(((tweets.size()) - 1)).getID();
}