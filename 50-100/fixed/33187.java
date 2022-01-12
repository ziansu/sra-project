private void processRelationships() {
    for (java.util.Map.Entry<java.lang.Class, java.util.List<com.breeze.save.EntityInfo>> entry : saveMap.entrySet()) {
        java.lang.Class entityType = entry.getKey();
        org.hibernate.metadata.ClassMetadata classMeta = sessionFactory.getClassMetadata(entityType);
        for (com.breeze.save.EntityInfo entityInfo : entry.getValue()) {
            addToGraph(entityInfo, null);
            fixupRelationships(entityInfo, classMeta);
        }
    }
}