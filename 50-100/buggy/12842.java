public void start() {
    com.stuin.tenseconds.Round.moving = true;
    com.stuin.tenseconds.Round.playing = true;
    com.stuin.tenseconds.Round.loss = false;
    ((com.stuin.tenseconds.Views.Grid) (getChildAt(0))).enter();
    ((com.stuin.tenseconds.Views.Grid) (getChildAt(2))).enter();
    ((com.stuin.tenseconds.Views.Timer) (getChildAt(1))).start();
    postDelayed(title, 100);
}