protected static java.lang.String getBNpos_nl(java.util.Map<java.lang.String, it.uniroma1.lcl.babelnet.data.BabelPOS> posMapping, java.lang.String pos) {
    java.lang.String pos3chars = "";
    if ((pos.length()) > 3) {
        pos3chars = pos.substring(0, 3).toLowerCase();
    }else {
        return null;
    }
    it.uniroma1.lcl.babelnet.data.BabelPOS bnPos = posMapping.get(pos3chars);
    if (bnPos == null) {
        return null;
    }else {
        return bnPos.toString();
    }
}