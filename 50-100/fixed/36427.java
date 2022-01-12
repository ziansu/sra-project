@java.lang.Override
public void runOpMode() throws java.lang.InterruptedException {
    initialize();
    waitForStart();
    core.forward(23, 0.25);
    core.turn((-7.5), 0.1);
    core.forward(35, 0.25);
    core.turn(11.2, 0.1);
    core.forward(36, 0.25);
}