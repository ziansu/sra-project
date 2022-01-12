@java.lang.Override
public void receiveToggle(final int toggleId, final boolean active) {
    waveDisplay.setSignalVisibility(toggleId, active);
}