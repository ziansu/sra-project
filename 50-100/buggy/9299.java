@java.lang.SuppressWarnings(value = "deprecation")
@org.junit.Test
public void testRandomFish1() {
    java.util.Random random = new java.util.Random(seed);
    generatedFish = lasersharks.FishBot.generateFish(random);
    org.junit.Assert.assertEquals(generatedFish.getDirection(), Direction.East);
    org.junit.Assert.assertEquals(generatedFish.getPosition().getPosX(), 0, 0);
    org.junit.Assert.assertEquals(expectedSize1, generatedFish.getSize(), 1);
    org.junit.Assert.assertEquals(expectedSpeed1, generatedFish.getSpeed(), 0.0F);
}