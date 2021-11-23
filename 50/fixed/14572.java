protected void stopProgram(co.cask.cdap.proto.Id.Program program, int expectedStatusCode) throws java.lang.Exception {
    stopProgram(program, null, expectedStatusCode);
}