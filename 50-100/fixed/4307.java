public void run() {
    try {
        group2.sdp.robot.commandreciever.Brain.KICKER.rotate(group2.sdp.robot.commandreciever.Brain.KICKER_ANGLE);
        java.lang.Thread.sleep(group2.sdp.robot.commandreciever.Brain.KICKER_DELAY);
        group2.sdp.robot.commandreciever.Brain.KICKER.rotate((-(group2.sdp.robot.commandreciever.Brain.KICKER_ANGLE)));
        java.lang.Thread.sleep(group2.sdp.robot.commandreciever.Brain.KICKER_DELAY);
    } catch (java.lang.InterruptedException exc) {
        java.lang.System.out.println(exc.toString());
    }
    group2.sdp.robot.commandreciever.Brain.kicking = false;
}