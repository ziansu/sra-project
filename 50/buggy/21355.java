@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    io.kimo.gameoflifeview.view.GameOfLifeView gameOfLifeView = new io.kimo.gameoflifeview.view.GameOfLifeView(this);
    setContentView(gameOfLifeView);
    gameOfLifeView.resume();
}