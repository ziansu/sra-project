@java.lang.Override
public boolean filter(org.eclipse.eef.properties.ui.api.IEEFTabDescriptor tabDescriptor) {
    boolean result = true;
    if (org.eclipse.sirius.ui.properties.internal.filter.SiriusTabDescriptorFilter.SEMANTIC_TAB_ID.contains(tabDescriptor.getId())) {
        result = SiriusPropertiesCorePreferences.INSTANCE.isSemanticTabFiltered();
    }else
        if (org.eclipse.sirius.ui.properties.internal.filter.SiriusTabDescriptorFilter.DEFAULT_TAB_IDS.equals(tabDescriptor.getId())) {
            result = SiriusPropertiesCorePreferences.INSTANCE.isDefaultTabFiltered();
        }
    
    return result;
}