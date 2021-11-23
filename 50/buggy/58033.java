@org.junit.Test
public void testGetTrendingPosts() {
    java.util.List<services.dataAccess.proto.PostProto.Post> post = redditSource.getTrendingPosts("", 1, null);
    java.lang.System.out.println(post.get(0));
    assertEquals(1, post.size());
}