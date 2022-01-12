public static org.sugarj.common.Exec.ExecutionResult run(boolean silent, java.lang.String... cmds) {
    return new org.sugarj.common.Exec(silent).runWithPrefix(cmds[0], null, cmds);
}