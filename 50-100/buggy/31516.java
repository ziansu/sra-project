private void createPost(java.lang.String title, java.lang.String description, java.lang.String category) {
    post = new ha.thanh.pikerfree.models.Post();
    post.setTitle(title);
    post.setDescription(description);
    post.setCategory(category);
    post.setLat(mModel.getUserLat());
    post.setLng(mModel.getUserLng());
    post.setPostId(postCount);
    post.setOwnerId(dataUser.getId());
    post.setTimePosted(ha.thanh.pikerfree.utils.Utils.getCurrentTimestamp());
}