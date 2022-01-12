@java.lang.Override
public java.util.List<java.lang.String> getClassSubClasses(java.lang.String subject) {
    java.util.List<impl.Relationship> subClassesRela = this.childrenRelationships.get(subject);
    if (subClassesRela == null)
        return new java.util.ArrayList<java.lang.String>();
    
    java.util.List<java.lang.String> subClassesNames = new java.util.ArrayList<java.lang.String>();
    for (impl.Relationship r : subClassesRela) {
        subClassesNames.add(r.getDependentClass());
        subClassesNames.addAll(getClassSubClasses(subject));
    }
    return subClassesNames;
}