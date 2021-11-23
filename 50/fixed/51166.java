public void update(long lastTime) {
    now = java.lang.System.currentTimeMillis();
    if ((now) < lastTime)
        return ;
    else {
        move(dir, lastTime, now);
    }
}