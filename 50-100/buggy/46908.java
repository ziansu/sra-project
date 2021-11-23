public void checkReopenSeek(org.jruby.runtime.ThreadContext context, org.jruby.Ruby runtime, long pos) {
    if (((seek(context, pos, PosixShim.SEEK_SET)) < 0) && ((errno()) != null)) {
        throw runtime.newErrnoFromErrno(errno(), getPath());
    }
}