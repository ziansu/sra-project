@org.junit.Test
public void testPostConstructorDB() {
    java.lang.String title = "Please get me out of the db!";
    java.lang.String text = "All I want is to be with you!";
    logic.Post op = new logic.Post(title, text);
    long postID = op.save();
    logic.Post post = new logic.Post(postID);
    assertEquals(postID, post.postID);
}