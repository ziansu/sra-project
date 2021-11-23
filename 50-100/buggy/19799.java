public void update() {
    if (((mousePressed) && ((simulate) == false)) && (!(s.isBottom()))) {
        simulate = true;
    }
    if (!(simulate)) {
        return ;
    }
    s.update();
    if (s.isBottom()) {
        simulate = false;
    }
}