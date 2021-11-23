public static boolean checkUserRelatedToPost(java.lang.Long id, com.nick.hateportal.entity.User user) {
    java.util.List<com.nick.hateportal.entity.Post> list = user.getSentPosts();
    for (com.nick.hateportal.entity.Post p : list) {
        if ((p.getId()) == id) {
            return true;
        }
    }
    return false;
}