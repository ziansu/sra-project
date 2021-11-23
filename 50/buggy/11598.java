@java.lang.Override
protected void execute() {
    if (!(limitBottom.get())) {
        Robot.lift.Lower();
    }else {
        Robot.lift.Stop();
    }
    finished = true;
}