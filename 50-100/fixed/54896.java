private boolean cansplit(com.coloniergames.ld37.level.Bnt node, int minsize) {
    return !(((node.getHeight()) < ((minsize * 2) + 1)) || ((node.getWidth()) < ((minsize * 2) + 1)));
}