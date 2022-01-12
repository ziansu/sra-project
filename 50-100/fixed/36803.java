public void updateUser(javafx.event.ActionEvent actionEvent) {
    int res = listView.getSelectionModel().getSelectedIndex();
    if (controller.getCurrentUser().getUsername().equals(userArray[res].getUsername())) {
        controller.showError("Cant update current user");
    }else {
        if (res == (-1)) {
            controller.showError("Error you need to choose an account");
        }else {
            controller.showUpdateUserDialog(userArray[res]);
        }
    }
}