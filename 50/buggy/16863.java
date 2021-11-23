public static org.sugarj.common.Exec.ExecutionResult run(boolean silent, org.sugarj.common.path.Path dir, java.lang.Object... cmds) {
    return new org.sugarj.common.Exec(silent).runWithPrefix(cmds[0].toString(), dir, cmds);
}