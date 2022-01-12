@com.github.dockerjava.core.command.Test
public void nullAuthConfig() throws java.lang.Exception {
    com.github.dockerjava.core.command.PullImageCmdImpl pullImageCmd = new com.github.dockerjava.core.command.PullImageCmdImpl(com.github.dockerjava.core.command.PullImageCmdImplTest.NOP_EXEC, "");
    try {
        pullImageCmd.withAuthConfig(null);
        fail();
    } catch (java.lang.Exception e) {
        assertEquals(e.getMessage(), "authConfig was not specified");
    }
}