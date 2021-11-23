public java.lang.String opt(final int valueFieldNbr) {
    if ((runParm.values.length) > valueFieldNbr)
        return null;
    
    final java.lang.String s = get(valueFieldNbr);
    return s.isEmpty() ? null : s;
}