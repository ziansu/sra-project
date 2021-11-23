public static org.sugarj.common.Exec.ExecutionResult run(boolean silent, java.lang.String cmd, java.lang.Object... cmds) {
    return new org.sugarj.common.Exec(silent).runWithPrefix(cmd, null, org.sugarj.common.util.ArrayUtils.arrayAdd(cmd, cmds));
}