private static long toArrayIndex(java.lang.String id) {
    double d = org.mozilla.javascript.ScriptRuntime.toNumber(id);
    if (d == d) {
        long index = org.mozilla.javascript.ScriptRuntime.toUint32(d);
        if ((index == d) && (index != 4294967295L)) {
            if (java.lang.Long.toString(index).equals(id)) {
                return index;
            }
        }
    }
    return -1;
}