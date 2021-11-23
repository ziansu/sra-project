@java.lang.Override
public boolean deletePost(int postId) {
    if (myblog.domain.Post.isValidPostId(postId)) {
        throw new myblog.exception.GenericException(myblog.exception.GenericMessageMeta.INVALID_ID, "post_id", Response.Status.BAD_REQUEST);
    }
    myblog.domain.Post post = new myblog.domain.Post();
    post.setPost_enabled(false);
    org.apache.ibatis.session.SqlSession session = this.myBatisDaoFactory.getDefaultSqlSessionFactory().openSession(true);
    myblog.dao.MyBatis.Mapper.PostMapper postMapper = session.getMapper(myblog.dao.MyBatis.Mapper.PostMapper.class);
    return postMapper.updatePost(postId, post);
}