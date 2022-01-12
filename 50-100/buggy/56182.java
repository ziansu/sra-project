public void processResult(javafx.event.ActionEvent event) {
    Random ran = new Random();
    java.lang.String log = inputName.getText();
    int pass = java.lang.Integer.parseInt(inputDate.getText());
    int fourdigit = pass % 10000;
    int num = (ran.nextInt(90)) + 10;
    result.setText((((((log.substring(0, 2)) + ".") + num) + fourdigit) + ""));
}