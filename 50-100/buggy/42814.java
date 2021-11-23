protected void updateThreadStatus(com.laneve.asp.ASMAnalysis.asmTypes.AnValue outer, long id, int status) {
    for (com.laneve.asp.ASMAnalysis.asmTypes.AnValue a : outer.getFields())
        if ((a instanceof com.laneve.asp.ASMAnalysis.asmTypes.ThreadValue) && ((((com.laneve.asp.ASMAnalysis.asmTypes.ThreadValue) (a)).getThreadID()) == id))
            ((com.laneve.asp.ASMAnalysis.asmTypes.ThreadValue) (a)).setStatus(status);
        else
            updateThreadStatus(a, id, status);
        
    
}