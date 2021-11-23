public void showClock() {
    if ((minesweeper.View.ClockView.theClock) != null) {
        if (minesweeper.View.ClockView.theClock.stage.isShowing()) {
            minesweeper.View.ClockView.theClock.grow();
        }
        stage.show();
    }else {
        game.pause();
        minesweeper.View.ClockView.theClock = new minesweeper.View.ClockView(game);
        stage.show();
    }
}