public static se.sics.jipv6.yal.Encap.FingerPrintMode getByMode(int mode) {
    se.sics.jipv6.yal.Encap.FingerPrintMode[] values = se.sics.jipv6.yal.Encap.FingerPrintMode.values();
    if (((mode >= 0) && (mode < (values.length))) && ((values[mode].mode) == mode)) {
        return values[mode];
    }
    for (se.sics.jipv6.yal.Encap.FingerPrintMode p : values) {
        if ((p.mode) == mode) {
            return p;
        }
    }
    return null;
}