@org.junit.Before
public void setUp() throws java.lang.Exception {
    branch = new ru.spbau.mit.command.BranchCmd();
    org.mockito.Mockito.doNothing().when(core).createBranch(org.mockito.ArgumentMatchers.anyString());
    org.mockito.Mockito.doNothing().when(core).removeBranch(org.mockito.ArgumentMatchers.anyString());
}