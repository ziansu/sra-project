public void sendAutonDesc(int id) {
    edu.wpi.first.wpilibj.smartdashboard.SmartDashboard.putString("Custom\\AutonDesc", robot.getAutonManager().getAutons().get(id).getDescription());
}