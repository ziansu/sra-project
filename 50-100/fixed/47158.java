public void refreshContentDescription() {
    org.talend.repository.navigator.INavigatorDescriptor navDesc = getNavDesc();
    final java.lang.String descriptor = navDesc.getDescriptor();
    if (navDesc == null) {
        setContentDescription("");
    }else
        if (((service) != null) && (service.isGIT())) {
            service.configureCombo(descriptor);
        }else {
            setContentDescription(descriptor);
        }
    
}