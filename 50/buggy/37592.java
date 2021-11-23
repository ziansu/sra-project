public void start() {
    java.util.concurrent.BlockingQueue<samza.examples.rss.utils.FeedDetails> feedDetails = readUrlFile();
    while (!(feedDetails.isEmpty())) {
        java.lang.System.out.println(feedDetails.poll());
    } 
}