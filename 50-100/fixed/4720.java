public void updateLevelButtons(com.alexaut.kroniax.Application app) {
    int unlockedLevels = app.getProgressManager().getUnlockedLevels();
    for (int i = 0; i < 9; i++) {
        int number = java.lang.Integer.parseInt(getChildren().get(i).getName());
        getChildren().get(i).setVisible((number <= unlockedLevels));
    }
}