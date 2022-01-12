@org.junit.Test
public void testBuildSucceed() {
    com.epam.java.se.unit04.Actor actor = com.epam.java.se.unit04.Actor.build("Edward Norton");
    java.lang.String expectedName = "Edward Norton";
    assertEquals(expectedName, actor.getName());
}