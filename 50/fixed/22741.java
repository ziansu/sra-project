private void programAborted(final pipeline.core.Program program, final java.lang.Exception e) {
    java.lang.System.out.println((("Program with id " + (program.getId())) + " aborted"));
    executionHandler.programAborted(program, e);
}