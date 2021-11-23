@java.lang.Override
public int getProgress(org.apache.zeppelin.interpreter.InterpreterContext context) {
    return ((completedCommands) * 100) / (totalCommands);
}