public com.laneve.asp.ASMAnalysis.asmTypes.VarThreadValue clone() {
    com.laneve.asp.ASMAnalysis.asmTypes.VarThreadValue x = new com.laneve.asp.ASMAnalysis.asmTypes.VarThreadValue(this, threadID, status, name, index);
    return x;
}