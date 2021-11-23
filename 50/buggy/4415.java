public static boolean isMemory(java.lang.String candidate) {
    return (IC.lir.CompileTimeData.isRegName(candidate)) || (IC.lir.CompileTimeData.isImmediate(candidate));
}