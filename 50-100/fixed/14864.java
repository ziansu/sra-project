public org.openflexo.foundation.fml.editionaction.EditionAction getBaseEditionAction() {
    org.openflexo.foundation.fml.editionaction.EditionAction returned = editionActionMap.get(getEditionActionClass());
    if (returned == null) {
        returned = makeEditionAction();
        if (returned != null) {
            editionActionMap.put(editionActionClass, returned);
            returned.getPropertyChangeSupport().addPropertyChangeListener(this);
        }
    }
    return returned;
}