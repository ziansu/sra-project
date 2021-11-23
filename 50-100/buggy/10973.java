@java.lang.Override
public java.lang.Long createPost(java.lang.Long userId, edu.iis.mto.blog.api.request.PostRequest postRequest) {
    edu.iis.mto.blog.domain.model.User user = userRepository.findOne(userId);
    if (!(user.getAccountStatus().equals(AccountStatus.CONFIRMED))) {
        throw new edu.iis.mto.blog.domain.errors.DomainError("user is not confirmed");
    }
    edu.iis.mto.blog.domain.model.BlogPost post = mapper.mapToEntity(postRequest);
    post.setUser(user);
    blogPostRepository.save(post);
    return post.getId();
}