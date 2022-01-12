@org.junit.Test
public void testRocketCatExists() throws java.lang.Exception {
    com.github.baloise.rocketchatrestclient.model.ServerInfo info = rc.getServerInformation();
    org.junit.Assert.assertTrue("The Rocket.Chat Version is empty, when it shouldn't be.", (!(info.getVersion().isEmpty())));
    com.github.baloise.rocketchatrestclient.model.User rocketCat = rc.getUser("rocket.cat");
    org.junit.Assert.assertTrue("The Rocket.Cat user's id doesn't match what it should be.", "rocket.cat".equals(rocketCat.getId()));
}