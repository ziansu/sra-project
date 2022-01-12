void initializeControllers() {
    createLevelBtn.addActionListener(new controllers.CreateLevelBtnController(b));
    for (view.ExistingLevelView elv : viewerAndEditor.getExistingLevelButtons()) {
        elv.addActionListener(new controllers.ExistingLevelEditController());
    }
    for (view.LevelTypeToggle ltt : levelTypesAndText.getLevelTypeButtons()) {
        ltt.addActionListener(new controllers.NewLevelTypeController(this));
    }
}