@org.junit.Test
public void testInitialisation() {
    controller.LevelController levelController = new controller.LevelController();
    org.junit.Assert.assertTrue((levelController != null));
}