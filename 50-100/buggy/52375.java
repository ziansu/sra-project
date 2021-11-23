public net.oneandone.stool.locking.Lock acquire(java.lang.String name, net.oneandone.sushi.cli.Console console, net.oneandone.stool.locking.Mode mode) throws java.io.IOException {
    net.oneandone.stool.locking.Lock result;
    switch (mode) {
        case NONE :
            break;
        case SHARED :
            awaitLock(name, false, console);
            break;
        case EXCLUSIVE :
            awaitLock(name, true, console);
            break;
        default :
            throw new java.lang.IllegalStateException(mode.toString());
    }
    result = new net.oneandone.stool.locking.Lock(this, name, mode);
    active.add(result);
    return result;
}