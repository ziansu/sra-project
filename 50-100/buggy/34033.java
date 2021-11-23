public void start() {
    com.stuin.tenseconds.Round.playing = true;
    ((com.stuin.tenseconds.Views.Grid) (getChildAt(0))).enter();
    ((com.stuin.tenseconds.Views.Grid) (getChildAt(2))).enter();
    ((com.stuin.tenseconds.Views.Timer) (getChildAt(1))).start();
    slideDrawer.showPrimary();
    postDelayed(title, 100);
}