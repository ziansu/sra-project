@org.junit.Test
public void testBuildSucceed() {
    com.epam.java.se.unit04.Actor actor = com.epam.java.se.unit04.Actor.build("Edward Norton");
    java.lang.String expectedName = "v";
    assertEquals(expectedName, actor.getName());
}