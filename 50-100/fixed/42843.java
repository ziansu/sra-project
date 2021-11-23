public void jumpUp() {
    if ((jump) > 0) {
        return ;
    }
    if (((stands) != null) && (!(stands.getDead()))) {
        jump = 5;
        AudioServer.jump.play(false);
    }
}