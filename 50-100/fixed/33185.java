public int getVeinCount(java.util.Random random) {
    float diff = (veinCount) - ((int) (veinCount));
    return ((int) (veinCount)) + ((random.nextFloat()) < diff ? 1 : 0);
}