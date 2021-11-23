private static long getRelationId(double[] centerKey, double[] keyToInsert) {
    long result = 0;
    for (int i = 0; i < (centerKey.length); i++) {
        if ((keyToInsert[i]) <= (centerKey[i])) {
            result += 1;
        }
        result = result << 2;
    }
    return result + (org.mwg.ml.common.structure.NDTree._RELCONST);
}