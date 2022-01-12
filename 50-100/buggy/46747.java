public static void setComments(net.dean.jraw.models.Submission s) {
    com.lusfold.androidkeyvaluestore.KVStore.getInstance().insertOrUpdate(("comments" + (s.getFullName())), java.lang.String.valueOf(s.getCommentCount()));
    me.ccrama.redditslide.LastComments.commentsSince.put(s.getFullName(), s.getCommentCount());
}