public java.lang.String showNewQuestion() {
    newPost = postService.getNewPost();
    return "showNewQuestion_success";
}