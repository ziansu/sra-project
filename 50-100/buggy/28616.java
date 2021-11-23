@java.lang.Override
public void visitInsn(int opcode) {
    switch (opcode) {
        case org.objectweb.asm.Opcodes.MONITORENTER :
            com.github.fdesu.lia.transform.visitors.MonitorUtils.onMonitorEnter(opcode);
            modified = true;
            break;
        case org.objectweb.asm.Opcodes.MONITOREXIT :
            com.github.fdesu.lia.transform.visitors.MonitorUtils.onMonitorExit(opcode);
            modified = true;
            break;
        default :
            break;
    }
}