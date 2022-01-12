public void update(org.newdawn.slick.GameContainer gc) {
    for (int i = 0; i < (numOfEnemies); i++) {
        if ((enemies[i]) != null) {
            enemies[i].update(gc);
            enemies[i].setRobotPos(robot.getPos());
            if ((enemies[i].getHealth()) == 0) {
                enemies[i] = null;
            }
        }
    }
}