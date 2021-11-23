public net.schmizz.sshj.SSHClient toClient() {
    net.schmizz.sshj.SSHClient sshClient = new net.schmizz.sshj.SSHClient();
    try {
        sshClient.addHostKeyVerifier(new net.schmizz.sshj.transport.verification.PromiscuousVerifier());
        sshClient.loadKnownHosts();
        sshClient.setConnectTimeout(connectionTimeout);
        sshClient.setTimeout(timeout);
    } catch (java.io.IOException e) {
    }
    return sshClient;
}