@org.junit.BeforeClass
public static void setPlayer() {
    org.krugdev.PlayerTest.player = new org.krugdev.domain.player.Player();
    try {
        org.krugdev.PlayerTest.player.getFromAPI(Platform.XBOX, "6479371");
    } catch (org.krugdev.auxiliary.ResourceNotFoundException e) {
        fail("player not found");
    }
}