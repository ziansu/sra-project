public static java.util.ArrayList<edu.saxion.kuiperklaczynski.tweethack.objects.Tweet> readJSONArray(org.json.JSONArray statuses) throws org.json.JSONException {
    java.util.ArrayList<edu.saxion.kuiperklaczynski.tweethack.objects.Tweet> tempTweets = new java.util.ArrayList<>();
    for (int i = 0; i < (statuses.length()); i++) {
        edu.saxion.kuiperklaczynski.tweethack.objects.Tweet tweet = new edu.saxion.kuiperklaczynski.tweethack.objects.Tweet(statuses.getJSONObject(i));
        tempTweets.add(tweet);
        edu.saxion.kuiperklaczynski.tweethack.io.JSONLoading.tweetsMap.put(tweet.getId(), tweet);
    }
    edu.saxion.kuiperklaczynski.tweethack.io.JSONLoading.tweetsList = tempTweets;
    return tempTweets;
}