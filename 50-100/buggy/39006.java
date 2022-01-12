public void onStatus(twitter4j.Status tweet) {
    if ((spamDetector.isNotSpam(tweet, currentTime)) && (!(tweet.isRetweet()))) {
        recognition.entityRecognition(tweet, locationController, organizationController, personController, languageController, hashtagController, urlController);
    }
}