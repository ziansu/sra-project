public java.util.Map<java.lang.Integer, java.lang.Long> getSentimentResultByTopic(java.util.List<netCrackerTestApp.objects.SentimentTweet> sentimentTweetList) {
    java.util.Map<java.lang.Integer, java.lang.Long> collect = sentimentTweetList.stream().collect(java.util.stream.Collectors.groupingBy(SentimentTweet::getSentimentResult, java.util.stream.Collectors.counting()));
    return collect;
}