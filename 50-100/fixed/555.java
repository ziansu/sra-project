private org.neo4j.ogm.metadata.info.ClassInfo _classInfo(java.lang.String name, java.lang.String nodeEntityAnnotation, java.lang.String annotationPropertyName) {
    java.util.List<org.neo4j.ogm.metadata.info.ClassInfo> labelledClasses = domainInfo.getClassInfosWithAnnotation(nodeEntityAnnotation);
    if (labelledClasses != null) {
        for (org.neo4j.ogm.metadata.info.ClassInfo labelledClass : labelledClasses) {
            org.neo4j.ogm.metadata.info.AnnotationInfo annotationInfo = labelledClass.annotationsInfo().get(nodeEntityAnnotation);
            java.lang.String value = annotationInfo.get(annotationPropertyName, labelledClass.label());
            if (value.equals(name)) {
                return labelledClass;
            }
        }
    }
    return null;
}