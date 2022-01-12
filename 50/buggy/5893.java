@java.lang.Override
public void init() {
    setLayout(new java.awt.BorderLayout());
    add(ca.vanzeben.game.GameLauncher.game, java.awt.BorderLayout.CENTER);
    setMaximumSize(Game.DIMENSIONS);
    setMinimumSize(Game.DIMENSIONS);
    setPreferredSize(Game.DIMENSIONS);
    ca.vanzeben.game.GameLauncher.game.debug = ca.vanzeben.game.GameLauncher.DEBUG;
    ca.vanzeben.game.GameLauncher.game.isApplet = true;
}