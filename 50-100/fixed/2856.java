int insertNestedComment(com.andrewshu.android.reddit.things.ThingListing commentThingListing, int indentLevel, int insertedCommentIndex) {
    java.util.Deque<com.andrewshu.android.reddit.things.ThingInfo> commentsList = commentTreeDFSList(commentThingListing);
    java.util.Iterator<com.andrewshu.android.reddit.things.ThingInfo> iter = commentsList.iterator();
    while (iter.hasNext()) {
        com.andrewshu.android.reddit.things.ThingInfo ci = iter.next();
        processCommentSlowSteps(ci);
    } 
    appendCommentTree(commentsList);
    return insertedCommentIndex;
}