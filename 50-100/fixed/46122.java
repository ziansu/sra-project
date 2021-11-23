@java.lang.Override
public void load(java.util.Properties values) {
    java.lang.String name = values.getProperty((((getClass().getName()) + "|") + "midi"));
    if (org.apache.commons.lang3.StringUtils.isNoneEmpty(name)) {
        midiInputCombobox.setValue(name);
    }
}