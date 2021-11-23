@java.lang.Override
public final void leftClick(final it.paspiz85.nanobot.util.Point point, final boolean randomize) throws java.lang.InterruptedException {
    if (point == null) {
        throw new java.lang.IllegalArgumentException("point not provided");
    }
    it.paspiz85.nanobot.util.Point p = point;
    if (randomize) {
        p = new it.paspiz85.nanobot.util.Point((((p.x()) - 1) + (Utils.RANDOM.nextInt(3))), (((p.y()) - 1) + (Utils.RANDOM.nextInt(3))));
    }
    leftClick(p);
}