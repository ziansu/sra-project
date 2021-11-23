private void collect() {
    if (((p) == (org.firstinspires.ftc.teamcode.AManualD.pos.in)) && (gamepad2.y)) {
        robot.spinner.setPosition(p.getValue());
        p = org.firstinspires.ftc.teamcode.AManualD.pos.neutral;
    }else
        if (((p) == (org.firstinspires.ftc.teamcode.AManualD.pos.neutral)) && (gamepad2.y)) {
            robot.spinner.setPosition(p.getValue());
            p = org.firstinspires.ftc.teamcode.AManualD.pos.in;
        }
    
}