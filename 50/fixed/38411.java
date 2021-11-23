@java.lang.Override
public void focus(com.vaadin.event.FieldEvents.FocusEvent event) {
    comboProfiles.removeAllItems();
    addProfiles(comboProfiles);
}