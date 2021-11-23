public boolean doesCascade(javax.persistence.CascadeType cascadeOperation) {
    java.util.Set<javax.persistence.CascadeType> cascades = getCascadeOperations();
    return (cascadeOperation != null) && ((cascades.contains(CascadeType.ALL)) || (cascades.contains(cascadeOperation)));
}