public void shoot() {
    if (!(shoot)) {
        shoot = true;
        shooterMotor1.set(Shooter_Power);
    }else {
        Team4450.Robot10.Util.consoleLog("Shoot failed! Shot while shooting!");
    }
}