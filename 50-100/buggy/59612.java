@org.junit.Test
public void declineFriendInvite() throws java.io.IOException {
    org.junit.Assert.assertEquals(true, com.restfind.restaurantfinder.Database.declineFriendInvite("Alex", "Pia"));
    org.junit.Assert.assertEquals(true, com.restfind.restaurantfinder.Database.declineFriendInvite("Alex", "Max"));
    org.junit.Assert.assertEquals(true, com.restfind.restaurantfinder.Database.declineFriendInvite("Pia", "Max"));
}