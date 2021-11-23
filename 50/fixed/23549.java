@org.junit.Test
public void testStartLevelNoMaps() {
    levelController.setMaps(new java.util.ArrayList<>());
    levelController.startLevel();
    org.junit.Assert.assertNull(levelController.getPlayFieldLayer().getOnMousePressed());
}