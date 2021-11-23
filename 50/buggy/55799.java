@org.junit.Test
public void testAchievementconstructor1_level() {
    com.github.fishio.achievements.Achievement achievetest1 = new com.github.fishio.achievements.Achievement("Testachievement", 3);
    org.junit.Assert.assertEquals(3, achievetest1.getLevel(), 0.0);
}