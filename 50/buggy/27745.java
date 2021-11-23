public static void main(java.lang.String[] args) {
    xyz.upperlevel.openverse.launcher.OpenverseLauncher.instance = new xyz.upperlevel.openverse.launcher.OpenverseLauncher();
    xyz.upperlevel.openverse.launcher.OpenverseLauncher.instance.game.start();
    xyz.upperlevel.openverse.launcher.OpenverseLauncher.instance.game.setStage(new xyz.upperlevel.openverse.launcher.scenes.SingleplayerUniverseScene());
}