public synchronized net.oneandone.stool.locking.Lock acquire(java.lang.String name, net.oneandone.sushi.cli.Console console, net.oneandone.stool.locking.Mode mode) throws java.io.IOException {
    net.oneandone.stool.locking.Lock result;
    awaitLock(name, mode, console);
    result = new net.oneandone.stool.locking.Lock(this, name, mode);
    active.add(result);
    return result;
}