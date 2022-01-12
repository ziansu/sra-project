public net.schmizz.sshj.SSHClient toClient() {
    net.schmizz.sshj.SSHClient sshClient = new net.schmizz.sshj.SSHClient();
    try {
        sshClient.addHostKeyVerifier(new net.schmizz.sshj.transport.verification.PromiscuousVerifier());
        sshClient.setConnectTimeout(connectionTimeout);
        sshClient.setTimeout(timeout);
        sshClient.loadKnownHosts();
    } catch (java.io.IOException e) {
    }
    return sshClient;
}