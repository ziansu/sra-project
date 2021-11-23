private java.lang.String analyzeLineStart(java.lang.String line) throws polyu_af.exception.IllegalFormat {
    java.lang.String[] expAndVal = line.split(":");
    if ((expAndVal.length) != 2) {
        throw new polyu_af.exception.IllegalFormat(line);
    }
    return expAndVal[1];
}