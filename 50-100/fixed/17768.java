private int getTargetLevel() {
    int targetLevel = 0;
    for (int i = 0; i < (pow.backend.actors.Player.levelBreakpoints.length); i++) {
        if ((experience) >= (pow.backend.actors.Player.levelBreakpoints[i])) {
            targetLevel = i;
        }
    }
    return targetLevel;
}