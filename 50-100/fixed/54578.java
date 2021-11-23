private static long toArrayIndex(double d) {
    if (d == d) {
        long index = org.mozilla.javascript.ScriptRuntime.toUint32(d);
        if ((index == d) && (index != 4294967295L)) {
            return index;
        }
    }
    return -1;
}