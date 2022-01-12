public int killProcessGroup(jnr.constants.platform.Signal sig) {
    return posix.kill((-((int) (pid))), sig.intValue());
}