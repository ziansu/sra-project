@java.lang.Override
public final com.iri.training.model.Post addPost(final com.iri.training.model.Post post) throws java.sql.SQLException {
    com.iri.training.web.service.PostServiceImpl.logger.debug(("ENTERED addPost for post: " + post));
    final long postId = postRepository.addPostAndGetGeneratedId(post);
    com.iri.training.web.service.PostServiceImpl.logger.debug(("EXITING addPost for post: " + post));
    return getPostById(postId, false);
}