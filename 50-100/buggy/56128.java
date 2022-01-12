@org.junit.Test
public void addGameObject() {
    adventure.GameObject gameobj = null;
    junit.framework.Assert.assertNull("Should be null since uninitialized.", gameobj);
    gameobj = new adventure.Thing("Box", "A box to hold things");
    java.util.List<java.lang.String> objwords = null;
    junit.framework.Assert.assertNull("Should be null before initialization", objwords);
    objwords.add("Box");
    dictionary.addGameObject(gameobj);
    junit.framework.Assert.assertNotNull("Should return an id in a List", dictionary.getGameObjects(objwords));
}