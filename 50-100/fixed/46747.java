public static void setComments(net.dean.jraw.models.Submission s) {
    if ((me.ccrama.redditslide.LastComments.commentsSince) == null) {
        me.ccrama.redditslide.LastComments.commentsSince = new java.util.HashMap<>();
    }
    com.lusfold.androidkeyvaluestore.KVStore.getInstance().insertOrUpdate(("comments" + (s.getFullName())), java.lang.String.valueOf(s.getCommentCount()));
    me.ccrama.redditslide.LastComments.commentsSince.put(s.getFullName(), s.getCommentCount());
}