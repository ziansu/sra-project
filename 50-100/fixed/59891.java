private DistanceObject[] sortDistanceObjects(DistanceObject[] dObj, int objCount) {
    java.util.Arrays.sort(dObj, 0, objCount, new DistanceObjectComparator());
    for (int i = 0; i < objCount; i++) {
        CBIRQueryMapper.logger.info((((dObj[i].getKey()) + "\t") + (dObj[i].getValue())));
    }
    return dObj;
}