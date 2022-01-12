public void disenage() {
    for (game.motion.Rectangle struct : structures) {
        game.motion.MotionManager.getInstance(core).removeBody(struct);
    }
}