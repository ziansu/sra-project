@java.lang.Override
public void surfaceCreated(android.view.SurfaceHolder surfaceHolder) {
    background = new com.example.kai.verschachtelt.graphics.Background(android.graphics.BitmapFactory.decodeResource(getResources(), R.drawable.test_background));
    chessBoardGraphic = new com.example.kai.verschachtelt.graphics.ChessBoardGraphic();
    chessmanGraphic = new com.example.kai.verschachtelt.graphics.ChessmanGraphic();
    victoryScreenGraphic = new com.example.kai.verschachtelt.graphics.VictoryScreenGraphic(android.graphics.BitmapFactory.decodeResource(getResources(), R.drawable.victory_screens));
    pawnChangeGraphic = new com.example.kai.verschachtelt.graphics.PawnChangeGraphic(android.graphics.BitmapFactory.decodeResource(getResources(), R.drawable.chess_man_symbols));
    thread.setRunning(true);
    thread.start();
}