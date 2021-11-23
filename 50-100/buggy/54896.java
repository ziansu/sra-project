private boolean cansplit(com.coloniergames.ld37.level.Bnt node, int minsize) {
    return !(((node.getHeight()) < ((minsize + 1) * 2)) || ((node.getWidth()) < ((minsize + 1) * 2)));
}