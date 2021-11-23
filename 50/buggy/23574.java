private void removeAndReplace() {
    remove();
    playField.addBall(new com.noah.breakit.entity.mob.ball.Ball(x, y, xdir, ydir, xspeed, yspeed));
}