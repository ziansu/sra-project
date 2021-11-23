private boolean isSockReadSyscall(spade.reporter.audit.SYSCALL syscall) {
    boolean returnValue = isFileReadSyscall(syscall);
    if (syscall != null) {
        switch (syscall) {
            case RECV :
            case RECVMSG :
            case RECVFROM :
                returnValue = returnValue || true;
                break;
            default :
                returnValue = returnValue || false;
                break;
        }
    }else {
        returnValue = false;
    }
    return returnValue;
}