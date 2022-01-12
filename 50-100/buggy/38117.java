public static void tankDrive() {
    Systems.DriveBase.control_mode = 0;
    Systems.DriveBase.left_speed = (-(Joysticks.ly)) / (Systems.DriveBase.speed_down);
    Systems.DriveBase.right_speed = (Joysticks.ry) / (Systems.DriveBase.speed_down);
    if (Joysticks.lb)
        Systems.DriveBase.left_speed = (Systems.DriveBase.left_speed) * 2;
    
    if (Joysticks.rb)
        Systems.DriveBase.right_speed = (Systems.DriveBase.right_speed) * 2;
    
    Systems.DriveBase.left1.set(Systems.DriveBase.left_speed);
    Systems.DriveBase.left2.set(Systems.DriveBase.left_speed);
    Systems.DriveBase.right1.set(Systems.DriveBase.right_speed);
    Systems.DriveBase.right2.set(Systems.DriveBase.right_speed);
    Systems.DriveBase.dashboard();
}