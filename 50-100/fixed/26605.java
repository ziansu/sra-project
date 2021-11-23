private static long getRelationId(double[] centerKey, double[] keyToInsert) {
    long result = 0;
    for (int i = 0; i < (centerKey.length); i++) {
        if (i != 0) {
            result = result << 1;
        }
        if ((keyToInsert[i]) > (centerKey[i])) {
            result += 1;
        }
    }
    return result + (org.mwg.ml.common.structure.NDTree._RELCONST);
}