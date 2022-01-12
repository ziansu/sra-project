public xyz.edmw.post.Post build() {
    xyz.edmw.post.Post post = new xyz.edmw.post.Post();
    post.id = id;
    post.author = author;
    post.timestamp = timestamp;
    post.postNum = postNum;
    post.message = message;
    post.userTitle = userTitle;
    post.authorAvatar = authorAvatar;
    return post;
}