public void addPost(java.lang.String title) {
    com.micromata.webengineering.demo.post.PostPOJO tmp = new com.micromata.webengineering.demo.post.PostPOJO(postCounter);
    tmp.setTitle(title);
    tmp.setTimeOfCreation(new java.util.Date().toString());
    tmp.setContent("dummycontent");
    posts.add(postCounter, tmp);
    (postCounter)++;
}