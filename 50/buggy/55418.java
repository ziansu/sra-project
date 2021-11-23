@java.lang.Override
protected void initLimits(int range) {
    super.initLimits(range);
    --(minX);
    --(minZ);
    ++(maxX);
    ++(maxZ);
}