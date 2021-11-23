@org.junit.Test
public void filterYoungFemale() {
    clickOn(controller.view.rbtYoung);
    clickOn(controller.view.rbtFemale);
    java.util.Set<javafx.scene.Node> lbl = controller.view.vbxContentPane.lookupAll(".lblName");
    assertEquals(1, lbl.size());
    assertEquals("lisa simpson", ((javafx.scene.control.Labeled) (lbl.toArray()[0])).getText());
}