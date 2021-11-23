public int kill(jnr.constants.platform.Signal sig) {
    return posix.kill(pid, sig.intValue());
}