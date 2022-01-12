public static play.mvc.Result postPage(java.lang.String postName) {
    java.util.List<controllers.Post> posts = controllers.Post.getPostsWithPostName(postName);
    controllers.Application.currentPost = posts.get(0);
    java.util.List<controllers.Comment> comments = controllers.Comment.findComments(postName);
    return ok(postPage.render(controllers.Application.currentPost, comments, controllers.Application.currentTeam.getTeamName(), controllers.Application.getUnreadNum()));
}