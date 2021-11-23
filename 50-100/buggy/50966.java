public void initControllers() {
    goToMainMenu.addActionListener(new playerController.NavigateMainMenu(app));
    for (int i = 0; i < 15; i++) {
        levels[i].addActionListener(new playerController.PlayLevel(app, m, i));
    }
}