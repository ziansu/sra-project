@org.junit.Test
public void search() {
    clickOn(controller.view.txfSearchField);
    write("simpson");
    java.util.Set<javafx.scene.Node> lbl = controller.view.vbxContentPane.lookupAll(".lblName");
    assertEquals(2, lbl.size());
    clickOn(controller.view.rbtMiddle);
    assertTrue("homer simpson".equals(((javafx.scene.control.Labeled) (lbl.toArray()[0])).getText()));
}