public static int e96SMDCode(final int code) {
    int value = 0;
    if ((code >= 0) && (code < (com.stcarlso.goece.utility.EIATable.E96_VALUES.length)))
        value = com.stcarlso.goece.utility.EIATable.E96_VALUES[code];
    
    return value;
}