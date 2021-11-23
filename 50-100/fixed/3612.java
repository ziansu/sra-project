@java.lang.Override
public void surfaceCreated(android.view.SurfaceHolder holder) {
    games.bb.myfirstgame.GamePanel.Sheight = getResources().getDisplayMetrics().heightPixels;
    games.bb.myfirstgame.GamePanel.Swidth = getResources().getDisplayMetrics().widthPixels;
    grid = new games.bb.myfirstgame.Grid(5, 5, 0);
    menuButton = new android.widget.games.bb.myfirstgame.Button(android.graphics.BitmapFactory.decodeResource(getResources(), R.drawable.menubutton), 0, 0, 0.25);
    createMenus();
    thread = new games.bb.myfirstgame.MainThread(getHolder(), this);
    thread.setRunning(true);
    thread.start();
}