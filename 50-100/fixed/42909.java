public void calcNormal(double rotation) {
    if ((normal.getPosx()) == 0) {
        normal.setPosx(((normal.getPosy()) * (-1)));
        normal.setPosy(0.0);
    }else {
        normal.setPosy(normal.getPosx());
        normal.setPosx(0.0);
    }
}