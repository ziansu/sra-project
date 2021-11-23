protected static java.lang.String getBNpos_ro(java.util.Map<java.lang.String, it.uniroma1.lcl.babelnet.data.BabelPOS> posMapping, java.lang.String pos) {
    java.lang.String pos5chars = "";
    if ((pos.length()) > 1) {
        pos5chars = pos.substring(0, 5);
    }else {
        return null;
    }
    it.uniroma1.lcl.babelnet.data.BabelPOS bnPos = posMapping.get(pos5chars.toUpperCase());
    return bnPos.toString();
}