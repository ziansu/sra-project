public boolean raisePropertyChangeEvent(java.lang.String value) {
    if ((properties.getComponent()) != null) {
        return properties.getComponent().getForm().fireComponentEvent(com.google.appinventor.client.editor.youngandroid.events.ChangeProperty.create(com.google.appinventor.client.Ode.getCurrentChannel(), properties.getComponent().getUuid(), getName(), value));
    }
    return false;
}