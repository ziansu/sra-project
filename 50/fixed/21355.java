@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    gameOfLifeView = new io.kimo.gameoflifeview.view.GameOfLifeView(this);
    setContentView(gameOfLifeView);
    gameOfLifeView.resume();
}