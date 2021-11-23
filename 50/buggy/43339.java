@org.junit.Test
public void connectWithKey() {
    configureDefaultSSHSlaveLauncher().keyCredentials("test", sshd.getPrivateKeyString());
    slave.save();
    verify();
}