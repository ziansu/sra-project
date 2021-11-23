public com.example.domain.Post createPost() {
    com.example.domain.Author author = new com.example.domain.Author("Bill", "Gates");
    authorRepository.save(author);
    com.example.domain.Post post = new com.example.domain.Post("Dummy Post title");
    post.setAuthor(author);
    post.setBody("Here goes the Body for the Dummy Post!!!");
    return postRepository.save(post);
}