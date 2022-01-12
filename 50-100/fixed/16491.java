@org.junit.Test
public void testCollisionPlayerCoin() {
    final double oldscore = nl.tudelft.ti2206.group9.level.State.getScore();
    final int oldcoins = nl.tudelft.ti2206.group9.level.State.getCoins();
    player.collision(coin);
    org.junit.Assert.assertEquals(oldscore, nl.tudelft.ti2206.group9.level.State.getScore(), StateTest.DELTA);
    org.junit.Assert.assertEquals(oldcoins, nl.tudelft.ti2206.group9.level.State.getCoins());
}