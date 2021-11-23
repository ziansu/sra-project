public static boolean canAbsorb(com.game.junglelaw.AbstractCircle largeCircle, com.game.junglelaw.AbstractCircle smallCircle) {
    if (!(com.game.junglelaw.Utility.isAbsorbableLarger(largeCircle, smallCircle))) {
        return false;
    }
    return ((com.game.junglelaw.Utility.pointsDistance(largeCircle.getmCenter(), smallCircle.getmCenter())) + (smallCircle.getmRadius())) <= (1.1 * (largeCircle.getmRadius()));
}