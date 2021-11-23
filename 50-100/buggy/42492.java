void lose() {
    com.stuin.tenseconds.Round.moving = true;
    com.stuin.tenseconds.Round.loss = true;
    ((com.stuin.tenseconds.Views.Timer) (getChildAt(1))).end();
    ((com.stuin.tenseconds.Views.Grid) (getChildAt(0))).marked.display();
    ((com.stuin.tenseconds.Views.Grid) (getChildAt(2))).marked.display();
    postDelayed(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            menu = false;
            clear();
            scoreboard.done(false);
        }
    }, 1000);
}