public void addEntities(java.util.Map<java.lang.String, java.util.List<com.wegas.core.persistence.AbstractEntity>> entities, java.util.Map<java.lang.String, java.util.List<com.wegas.core.persistence.AbstractEntity>> container) {
    if (entities != null) {
        for (java.util.Map.Entry<java.lang.String, java.util.List<com.wegas.core.persistence.AbstractEntity>> entry : entities.entrySet()) {
            this.addEntities(entry.getKey(), entry.getValue(), container);
        }
    }
}