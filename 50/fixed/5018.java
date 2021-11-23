public void handleFeedback(java.io.InputStream in) throws java.io.IOException {
    fb = CarControlProtos.FeedBack.parseDelimitedFrom(in);
    processFeedback(fb);
}