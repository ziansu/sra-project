@javafx.fxml.FXML
public void onGroundedClick() {
    interactor.emptyQueue();
    logic.Extension grounded = argumentFramework.getGroundedExtension(previousCheckBox.isSelected());
    java.lang.System.out.println((("{" + (grounded.getArgumentNames())) + "}"));
    setUI();
}