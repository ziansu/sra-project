public synchronized void setSshUser(java.lang.String sshUser) {
    if (sshUser == null) {
        sshUser = "ubuntu";
    }
    this.sshUser = sshUser;
}