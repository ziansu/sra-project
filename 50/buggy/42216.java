@java.lang.Override
protected void recalculate() {
    maxLife = ((int) (((lvl.getCurrent()) * 2) + (3 * (hard.getCurrent()))));
}