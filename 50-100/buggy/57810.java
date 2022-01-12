@org.junit.Test
public void testPostUpdate() {
    java.lang.String title = "Test Post";
    java.lang.String text = "All I want is to be with you!";
    logic.Post op = new logic.Post(title, text);
    long postID = op.save();
    op.title = "Please get me out of the db!";
    op.save();
    logic.Post post = new logic.Post(postID);
    assertEquals(op.title, post.title);
}