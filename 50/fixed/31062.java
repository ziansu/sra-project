public void onScannedRobot(robo.ScannedRobotEvent e) {
    robo.PartsBot.Radar radar = ((robo.PartsBot.Radar) (parts[robo.PartsBot.RADAR]));
    enemy.update(e, this);
}