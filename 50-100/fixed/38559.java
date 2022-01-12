@java.lang.Override
public void initializeWithMappings(java.util.Map<? extends java.lang.String, ? extends java.lang.String> newMappings) {
    com.google.common.base.Preconditions.checkState(mappings.isEmpty());
    if (!(newMappings.isEmpty())) {
        mappings.putAll(newMappings);
        if ((delegate) instanceof com.google.common.css.SubstitutionMap.Initializable) {
            ((com.google.common.css.SubstitutionMap.Initializable) (delegate)).initializeWithMappings(newMappings);
        }
    }
}