public java.lang.String showNewQuestion() {
    newPost = postService.getNewPost();
    java.lang.System.out.println(("Size:" + (newPost.size())));
    java.lang.System.out.println(newPost.get(0).getBody());
    return "showNewQuestion_success";
}