@java.lang.Override
public void load(java.util.Properties values) {
    java.lang.String name = values.getProperty((((getClass().getName()) + "|") + "midi"));
    if (org.apache.commons.lang3.StringUtils.isNoneEmpty(name)) {
        midiInputCombobox.setValue(name);
        try {
            net.hirschauer.yaas.lighthouse.LightHouseMidi.getInstance().setDevice(name);
        } catch (javax.sound.midi.MidiUnavailableException e) {
            logger.error(("Could not set midi device " + name), e);
        }
    }
}