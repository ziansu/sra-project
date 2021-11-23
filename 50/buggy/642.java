private void handleNewURL(URLScore urlScore) {
    synchronized(this.mapHeapLock) {
        this.urlScoreQueue.add(urlScore);
        this.urlToURLScoreMap.put(urlScore.getLink().getAbsUrl(), urlScore);
    }
}