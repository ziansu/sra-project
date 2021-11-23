@java.lang.Override
protected java.lang.String processLine(java.lang.String line) {
    if (input.isEmpty()) {
        return SequentialREPL.currentWorkingDirectory;
    }else {
        java.lang.System.out.println(Message.CANNOT_HAVE_INPUT.with_parameter(commandName));
        return null;
    }
}