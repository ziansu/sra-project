public void jump() {
    canModifyVelocity = true;
    program.Program.writeDebug(("jump (in RobotBase), id: " + (id)));
    container.processRobot(this);
}