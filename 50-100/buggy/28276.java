@org.junit.Test
public void commandBarAddTest() {
    com.jfoenix.controls.JFXTextField commandBar = find("#commandBar");
    javafx.scene.layout.BorderPane bottomPane = find("#bottomPane");
    assert bottomPane.getChildren().contains(commandBar);
    click(commandBar);
    type("Do Homework");
    push(javafx.scene.input.KeyCode.ENTER);
    org.junit.Assert.assertNotNull(find("#idLabelF1"));
    org.junit.Assert.assertNotNull(find("#taskLabelF1"));
}