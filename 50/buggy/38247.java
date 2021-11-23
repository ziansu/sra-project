@java.lang.Override
protected void initDefaultCommand() {
    if ((defaultCommand) != null) {
        java.lang.System.out.println("InitDef");
        setDefaultCommand(defaultCommand);
    }
}