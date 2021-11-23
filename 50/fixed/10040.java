@java.lang.Override
public void valueChange(org.vaadin.viritin.fields.MValueChangeEvent<com.dungeonstory.backend.data.ArmorType> event) {
    com.dungeonstory.backend.data.ArmorType currentarmorType = event.getValue();
    if (currentarmorType != null) {
        weight.setValue(((double) (currentarmorType.getBaseWeight())));
    }
}