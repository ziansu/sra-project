@java.lang.Override
public org.openflexo.foundation.fml.FlexoConceptInstanceType makeCustomType(java.lang.String configuration) {
    org.openflexo.foundation.fml.FlexoConcept concept = null;
    if (configuration != null) {
        concept = getTechnologyAdapter().getTechnologyAdapterService().getServiceManager().getViewPointLibrary().getFlexoConcept(configuration, false);
    }else {
        concept = getFlexoConceptType();
    }
    if (concept != null) {
        return org.openflexo.foundation.fml.FlexoConceptInstanceType.getFlexoConceptInstanceType(concept);
    }else {
        return new org.openflexo.foundation.fml.FlexoConceptInstanceType(configuration);
    }
}