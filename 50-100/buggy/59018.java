private java.lang.String getRel(java.lang.Class restInterface) {
    java.lang.String relation = null;
    org.phenotips.data.permissions.rest.internal.utils.annotations.Relation relationAnnotation = ((org.phenotips.data.permissions.rest.internal.utils.annotations.Relation) (restInterface.getAnnotation(org.phenotips.data.permissions.rest.internal.utils.annotations.Relation.class)));
    if (relationAnnotation != null) {
        relation = relationAnnotation.value();
    }
    return relation;
}