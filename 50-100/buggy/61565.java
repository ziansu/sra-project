@org.junit.Test
public void filterOld() {
    clickOn(controller.view.rbtOld);
    java.util.Set<javafx.scene.Node> lbl = controller.view.vbxContentPane.lookupAll(".lblName");
    assertEquals(1, lbl.size());
    assertEquals("Burns", ((javafx.scene.control.Labeled) (lbl.toArray()[0])).getText());
}