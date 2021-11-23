public static org.sugarj.common.Exec.ExecutionResult run(org.sugarj.common.path.Path dir, java.lang.Object... cmds) {
    return new org.sugarj.common.Exec(true).runWithPrefix(cmds[0].toString(), dir, cmds);
}