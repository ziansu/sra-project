@java.lang.Override
public void elevate(com.sshtools.forker.client.ForkerBuilder builder, java.lang.Process process, com.sshtools.forker.common.Command command) {
    builder.command().add(0, "sudo");
    builder.command().add(1, "-A");
    builder.environment().put("SUDO_ASKPASS", tempScript.getAbsolutePath());
}