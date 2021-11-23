private boolean isSockReadSyscall(spade.reporter.audit.SYSCALL syscall) {
    boolean returnValue = isFileReadSyscall(syscall);
    if (syscall != null) {
        switch (syscall) {
            case RECV :
            case RECVMSG :
            case RECVFROM :
                returnValue = returnValue || true;
            default :
                returnValue = returnValue || false;
        }
    }else {
        returnValue = false;
    }
    return returnValue;
}