public void joinTags(int tagId) {
    BlogsTags newBlogsTags = new BlogsTags(this.id, tagId);
    newBlogsTags.save();
}