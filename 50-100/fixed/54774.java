@javafx.fxml.FXML
private void goToScreen2(javafx.scene.input.KeyEvent e) {
    if (e.getCode().toString().equals("RIGHT")) {
        if ((currentTab) < ((TAB_COUNT) - 1))
            (currentTab)++;
        
    }
    if (e.getCode().toString().equals("LEFT")) {
        if ((currentTab) > 0)
            (currentTab)--;
        
    }
    openTab();
}