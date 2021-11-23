@org.junit.Test
public void testStartLevelNoMaps() {
    levelController.setMaps(new java.util.ArrayList<>());
    levelController.startLevel(org.mockito.Mockito.mock(javafx.animation.AnimationTimer.class));
    org.junit.Assert.assertNull(levelController.getPlayFieldLayer().getOnMousePressed());
}