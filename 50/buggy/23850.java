public int killProcessGroup(jnr.constants.platform.Signal sig) {
    return posix.kill((-(pid)), sig.intValue());
}