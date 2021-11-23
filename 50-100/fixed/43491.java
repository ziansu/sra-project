@org.junit.Test
public void testRandomFish2() {
    java.util.Random random = new java.util.Random(seedWest);
    generatedFish = lasersharks.FishBot.generateFish(random);
    org.junit.Assert.assertEquals(generatedFish.getDirection(), Direction.West);
    org.junit.Assert.assertEquals(generatedFish.getPosition().getPosX(), lasersharks.Position.getWidthPanel(), 1.0F);
    org.junit.Assert.assertEquals(expectedSize2, generatedFish.getSize(), 1.0F);
    org.junit.Assert.assertEquals(expectedSpeed2, generatedFish.getSpeed(), 0.0F);
}