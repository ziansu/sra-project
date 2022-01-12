@java.lang.Override
public java.lang.String execute(java.lang.String[] args) {
    if ((args.length) > 1) {
        if (checkModelDefined()) {
            if (getCurrentModel().endsWith(".model")) {
                return editEntityDSL(args[1]);
            }else {
                return editDBModelFile();
            }
        }
    }else {
        return invalidUsage("entity-name expected");
    }
    return null;
}