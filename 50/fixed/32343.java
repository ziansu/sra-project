void closeJSch() {
    if ((sftp) != null) {
        sftp.exit();
    }
    if ((sshSession) != null) {
        sshSession.disconnect();
    }
}