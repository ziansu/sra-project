private void Gravitation() {
    boolean falling = true;
    com.salmat_team.offsetball.Floor floor = null;
    for (int i = 0; (i < (floorList.size())) && falling; i++) {
        floor = floorList.get(i);
        if (ball.OnFloor(floor, true)) {
            falling = false;
        }
    }
    if (falling) {
        ball.Fall(1.5, com.salmat_team.offsetball.MotionSensor.getX());
    }
}