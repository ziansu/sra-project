protected void addRemindBef(java.lang.String[] arg) {
    java.lang.String[] restOfArgs = new java.lang.String[(arg.length) - 2];
    for (int i = 0; i < ((arg.length) - 2); i++) {
        restOfArgs[i] = arg[(i + 2)];
    }
    logic.addRemindBef(arg[0], arg[1], restOfArgs);
}