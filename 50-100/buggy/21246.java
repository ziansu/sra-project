private static void generateCode(org.jnode.assembler.x86.X86Assembler os, java.lang.String className) throws java.lang.ClassNotFoundException, java.net.MalformedURLException {
    org.jnode.vm.classmgr.VmByteCode code = org.jnode.vm.compiler.ir.NativeTest.loadByteCode(className);
    org.jnode.vm.x86.compiler.l2.X86CodeGenerator x86cg = null;
    org.jnode.vm.compiler.ir.IRControlFlowGraph cfg = new org.jnode.vm.compiler.ir.IRControlFlowGraph(code);
    org.jnode.vm.bytecode.BytecodeViewer bv = new org.jnode.vm.bytecode.BytecodeViewer();
    org.jnode.vm.bytecode.BytecodeParser.parse(code, bv);
    java.lang.System.out.println(cfg);
    org.jnode.vm.compiler.ir.IRGenerator irg = new org.jnode.vm.compiler.ir.IRGenerator(cfg);
    org.jnode.vm.bytecode.BytecodeParser.parse(code, irg);
}