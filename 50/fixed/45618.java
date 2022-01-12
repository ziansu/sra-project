@java.lang.Override
public boolean isPumping() {
    return (sender.isRunning().get()) || (receiver.isRunning().get());
}