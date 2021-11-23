public void printCounterExample(rebeca.wrebeca.common.GlobalState gl, int stNum) {
    java.lang.StringBuffer str = new java.lang.StringBuffer();
    createCounterExample(gl, stNum, str, new java.util.HashSet<>());
}