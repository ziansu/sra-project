@java.lang.Override
protected java.lang.Void doInBackground(java.lang.String... params) {
    bl.CampusBLService.viewThisPost(postId);
    java.lang.String postId = params[0];
    isFollowed = bl.CampusBLService.isFollowed(postId);
    isPraised = bl.CampusBLService.isPraised(postId);
    post = bl.CampusBLService.getPostDetail(postId);
    replies = post.getReplyList();
    return null;
}