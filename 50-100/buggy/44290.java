public void setup() {
    int cols = 20;
    int rows = 20;
    AntLab.Board board = new AntLab.Board(cols, rows);
    AntLab.Background background = new AntLab.Background();
    register(background);
    AntLab.WallGroup wallGroup = new AntLab.WallGroup(this, board);
    register(wallGroup);
    AntLab.AntGroup antGroup = new AntLab.AntGroup(this, board);
    register(antGroup);
    AntLab.ShadowGroup shadowGroup = new AntLab.ShadowGroup(this, board);
    register(shadowGroup);
}