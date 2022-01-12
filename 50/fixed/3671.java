@java.lang.Override
public boolean isFinished() {
    try {
        return (available()) < 1;
    } catch (final java.io.IOException ex) {
        return true;
    }
}