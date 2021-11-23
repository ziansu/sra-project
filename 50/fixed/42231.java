void walkTowards(int steps, map.PathDirection direction) {
    super.setTempPath(direction.getTempPath(steps), null);
    walkingToPlayer = true;
}