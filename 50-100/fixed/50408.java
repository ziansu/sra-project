public void updateStatus(java.lang.String latestStatus) {
    if ((latestStatus.length()) < 1) {
        java.lang.System.out.println("Must give a status to tweet");
        return ;
    }
    twitter4j.Twitter twitter = new twitter4j.TwitterFactory().getInstance();
    twitter4j.Status status = null;
    try {
        status = twitter.updateStatus(latestStatus);
        java.lang.System.out.println((("Successfully updated the status to [" + (status.getText())) + "]."));
    } catch (twitter4j.TwitterException e) {
        e.printStackTrace();
    }
}