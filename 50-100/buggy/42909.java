public void calcNormal(double rotation) {
    if ((rotation == 90) || (rotation == 270)) {
        double tmp;
        tmp = normal.getPosx();
        normal.setPosx(normal.getPosy());
        normal.setPosy(tmp);
    }
    if (rotation == 180) {
        double tmp;
        tmp = -(normal.getPosx());
        normal.setPosx((-(normal.getPosy())));
        normal.setPosy(tmp);
    }
}