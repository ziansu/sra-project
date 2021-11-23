private void readCommandConfiguration() {
    commandConfigurations.add(new de.hellmann.command_sender.ssh.CommandConfiguration(0, "echo 'Hello World'", "Print Hello World", null));
    commandConfigurations.add(new de.hellmann.command_sender.ssh.CommandConfiguration(1, "ls -la", "Show directory content", null));
}