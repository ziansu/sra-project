private void fireValueChangedEvent() {
    if (hasPropertyChangeListener()) {
        java.util.List<org.talend.daikon.properties.presentation.Form> forms = componentProperties.getForms();
        for (org.talend.daikon.properties.presentation.Form form : forms) {
            if (form.isRefreshUI()) {
                this.pcs.firePropertyChange(IElementParameterEventProperties.EVENT_PROPERTY_VALUE_CHANGED, null, null);
                return ;
            }
        }
    }
}