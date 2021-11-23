private void readCommandConfiguration() {
    commandConfigurations.add(new de.hellmann.command_sender.ssh.CommandConfiguration("echo 'Hello World'", "Print Hello World", null));
    commandConfigurations.add(new de.hellmann.command_sender.ssh.CommandConfiguration("ls -la", "Show directory content", null));
}