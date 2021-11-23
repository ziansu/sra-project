public static void Run() throws java.lang.InterruptedException {
    try {
        edu.arizona.ece.memsim.implementations.core.ProgramSmall.Reset();
        edu.arizona.ece.memsim.implementations.core.ProgramSmall.SequentialAccess();
        edu.arizona.ece.memsim.implementations.core.ProgramSmall.Reset();
        edu.arizona.ece.memsim.implementations.core.ProgramSmall.RandomAccess();
        edu.arizona.ece.memsim.implementations.core.ProgramSmall.Reset();
        edu.arizona.ece.memsim.implementations.core.ProgramSmall.StrideAccess(true, 32);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}