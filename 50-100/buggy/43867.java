public java.lang.String arg1() {
    if ((curType.compareTo(org.reion.Parser.CommandType.C_RETURN)) == 0) {
        throw new java.lang.RuntimeException("No arg1 if type is C_RETURN!");
    }
    if ((curType.compareTo(org.reion.Parser.CommandType.C_ARITHMETIC)) == 0) {
        return curInstruct[0];
    }
    if (((curType.compareTo(org.reion.Parser.CommandType.C_PUSH)) == 0) || ((curType.compareTo(org.reion.Parser.CommandType.C_POP)) == 0)) {
        return curInstruct[1];
    }
    return null;
}