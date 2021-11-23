public void joinTags(int tagId) {
    BlogsTags newBlogsTags = new BlogsTags(tagId, this.id);
    newBlogsTags.save();
}