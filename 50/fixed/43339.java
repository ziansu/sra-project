@org.junit.Test
public void connectWithKey() {
    configureDefaultSSHSlaveLauncher().keyCredentials("test", sshd.getPrivateKeyString(), null);
    slave.save();
    verify();
}