private void handleExistingURL(java.lang.String urlString, double score) {
    URLScore existingUrl = this.urlToURLScoreMap.get(urlString);
    existingUrl.setScore(((existingUrl.getScore()) + score));
    if (!(this.urlScoreQueue.remove(existingUrl))) {
        log.error(java.lang.String.format("url %s should be in the queue", existingUrl.getLink().toString()));
    }
    this.urlScoreQueue.add(existingUrl);
}