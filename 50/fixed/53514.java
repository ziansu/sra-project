public int kill(jnr.constants.platform.Signal sig) {
    return posix.kill(((int) (pid)), sig.intValue());
}