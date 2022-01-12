@java.lang.Override
public com.itis.model.Post update(com.itis.model.Post post, com.itis.form.PostCreationForm form) {
    com.itis.model.Post post1 = transformer.apply(form);
    post.setTitle(post1.getTitle());
    post.setText(post1.getText());
    return postRepository.save(post);
}