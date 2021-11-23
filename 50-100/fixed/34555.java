public foogame.Stack[] split(int distanceDown) {
    if ((distanceDown == 0) || (distanceDown == (stones.length))) {
        throw new java.lang.RuntimeException("bad split size");
    }
    return new foogame.Stack[]{ new foogame.Stack(java.util.Arrays.copyOfRange(stones, 0, ((stones.length) - distanceDown))) , new foogame.Stack(java.util.Arrays.copyOfRange(stones, ((stones.length) - distanceDown), stones.length)) };
}