public void updateRobot() {
    if (inMotion()) {
        motion.executeMotion(this);
        if (hasMotionFault()) {
            global.Fields.debug("HERE!");
        }
    }
    updateOBBs();
}