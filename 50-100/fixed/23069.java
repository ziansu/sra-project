private void createProfile() {
    java.lang.String name = nameTextField.getText();
    if (profileController.canUserBeCreated(name)) {
        profileController.createProfile(name);
        settingController.setLeftMode(buttonLeftMode.isChecked());
        game.setScreen(new com.retroMachines.ui.screens.menus.ProfileMenuScreen(game));
    }else {
    }
}