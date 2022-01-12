public static void emitExitFunc(int size, java.io.PrintStream s) {
    CgenSupport.emitLoad(CgenSupport.FP, (3 + size), CgenSupport.SP, s);
    CgenSupport.emitLoad(CgenSupport.SELF, (2 + size), CgenSupport.SP, s);
    CgenSupport.emitLoad(CgenSupport.RA, (1 + size), CgenSupport.SP, s);
    CgenSupport.emitAddiu(CgenSupport.SP, CgenSupport.SP, ((3 + size) * (CgenSupport.WORD_SIZE)), s);
    CgenSupport.emitReturn(s);
}