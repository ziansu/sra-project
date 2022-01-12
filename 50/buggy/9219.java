@org.junit.Test
public void testRobPlayer() throws shared.exceptions.ServerException {
    java.lang.System.out.println("robPlayer");
    int victim = 1;
    shared.locations.HexLocation loc = new shared.locations.HexLocation(1, 1);
    instance.robPlayer(victim, loc);
}