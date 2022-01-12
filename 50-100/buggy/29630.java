private void find(long uid) {
    try {
        do {
            ids = twitter.getFollowersIDs(uid, cursor);
            for (long id : ids.getIDs()) {
                db.addFollower(uid, id);
            }
        } while ((cursor = ids.getNextCursor()) != 0 );
        db.commit();
    } catch (twitter4j.TwitterException e) {
        e.printStackTrace();
        java.lang.System.out.println(e.getMessage());
    }
}