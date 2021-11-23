@java.lang.Override
public void initialize(java.net.URL fxmlFileLocation, java.util.ResourceBundle resources) {
    this.errorText.setText(this.msg);
    this.title.setText(this.windowTitle);
    this.okayBtn.setOnAction(( event) -> close());
}