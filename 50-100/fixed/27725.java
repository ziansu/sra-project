public java.lang.String getOntologyPropertyCorrectCase(java.lang.String property) {
    property = property.toLowerCase();
    java.lang.String ontologyPropertyValue;
    if ((applications.extractionPostprocessing.util.DBpediaResourceServiceOffline.ontologiesPropertiesMap) == null) {
        this.loadOntologyClasses();
    }
    if ((applications.extractionPostprocessing.util.DBpediaResourceServiceOffline.ontologiesPropertiesMap.get(property)) != null) {
        ontologyPropertyValue = applications.extractionPostprocessing.util.DBpediaResourceServiceOffline.ontologiesPropertiesMap.get(property);
    }else
        ontologyPropertyValue = "<null>";
    
    return ontologyPropertyValue;
}