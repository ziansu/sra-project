@java.lang.Override
public boolean isOn(final java.util.logging.Level aLevel) {
    final java.util.logging.Level wCurrentLevel = pConfitionLevel.get();
    if (wCurrentLevel == (java.util.logging.Level.OFF)) {
        return false;
    }
    return (wCurrentLevel.intValue()) <= (aLevel.intValue());
}