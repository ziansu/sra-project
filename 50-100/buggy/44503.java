@java.lang.Override
public void execute() throws java.lang.Exception {
    if (help) {
        jcommander.usage("set-writer");
    }else {
        org.walkmod.WalkModFacade facade = new org.walkmod.WalkModFacade(org.walkmod.OptionsBuilder.options().printErrors(printErrors));
        facade.setWriter(chain, writerType.get(0), path, recursive, params);
    }
}