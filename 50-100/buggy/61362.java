@org.junit.Test
public void testGuessFollowsGraphMultipleAt() {
    java.util.Map<java.lang.String, java.util.Set<java.lang.String>> followsGraph = twitter.SocialNetwork.guessFollowsGraph(java.util.Arrays.asList(twitter.SocialNetworkTest.tweet8, twitter.SocialNetworkTest.tweet9));
    for (java.lang.String user : followsGraph.keySet())
        if (user.toLowerCase().equals("alyssa"))
            assertEquals("expected one follow", 3, followsGraph.get(user).size());
        
    
    assertEquals("user not in map", 0, 1);
}