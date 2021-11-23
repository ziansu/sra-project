protected java.lang.String[] getWhereParams() {
    if (((whereParams) == null) || ((whereParams.size()) == 0))
        return null;
    
    java.lang.String[] tmp = new java.lang.String[whereParams.size()];
    int i = 0;
    for (java.lang.String tmpS : whereParams) {
        tmp[i] = tmpS;
        i++;
    }
    return tmp;
}