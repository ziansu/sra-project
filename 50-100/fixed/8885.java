public void handleResetButtonAction(javafx.event.ActionEvent event) throws java.io.IOException {
    java.lang.System.out.println("reseting level");
    int i;
    try {
        i = java.lang.Integer.parseInt(levelNumber.getText());
    } catch (java.lang.Exception e) {
        return ;
    }
    resetPieces();
    resetButtons();
    resetBoard(i);
    resetFields(i);
}