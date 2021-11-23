public void execute() {
    for (org.usfirst.frc.team2473.robot.ThreadingButton button : buttonList) {
        button.activate(robot.database.getButton(button.getRef()));
    }
}