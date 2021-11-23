@java.lang.Override
public com.cisco.blogger.api.Blog getBlogById(java.lang.String blogId) {
    com.cisco.blogger.api.Blog blog = findOne("_id", blogId);
    return blog;
}