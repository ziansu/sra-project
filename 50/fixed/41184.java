private void buildGameComponent() {
    game = new net.selfip.mrmister.codeRunner.frame.RunnerPanel(this, applicationInfo, i18n);
    game.setSize(CodeRunner.WIDTH, CodeRunner.HEIGHT);
    add(game, java.awt.BorderLayout.CENTER);
}