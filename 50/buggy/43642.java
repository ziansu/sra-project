@java.lang.Override
protected void onStart() {
    super.onStart();
    loadFromFile();
    com.example.austin.inthemood.User updatedCurrentUser = controller.getElasticSearchUser(controller.getCurrentUser().getName());
    controller.updateUserList(updatedCurrentUser);
    saveInFile();
}