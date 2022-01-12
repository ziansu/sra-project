public void executeJump(org.objectweb.asm.tree.JumpInsnNode j, com.laneve.asp.ASMAnalysis.asmClasses.ValInterpreter in, int insn, int sInsn, int jump) throws org.objectweb.asm.tree.analysis.AnalyzerException {
    in.setJumpLabels(insn, sInsn, jump);
    execute(j, in);
    frameBehaviour = in.getBehaviour();
    in.resetCurrentMethod();
}