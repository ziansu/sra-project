@java.lang.Override
public void onEnable(xyz.upperlevel.ulge.game.Scene previous) {
    java.lang.System.out.println("> Singleplayer scene!");
    xyz.upperlevel.ulge.game.Scene scene = new xyz.upperlevel.openverse.launcher.scenes.SingleplayerResourceScene(this);
    setScene(scene);
    scene.onEnable(null);
}