public static void main(java.lang.String[] args) {
    my.project.gop.main.GameWindow frame = new my.project.gop.main.GameWindow("Zelda Dungeon Game", my.zdg.main.Main.monitorWidth, my.zdg.main.Main.monitorHeight);
    frame.setFullscreen(2);
    frame.setVisible(true);
    frame.add(new my.zdg.gameloop.GameLoop(my.zdg.main.Main.monitorWidth, my.zdg.main.Main.monitorHeight));
}