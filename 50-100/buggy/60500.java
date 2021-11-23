public void addCollectorItem(com.capitalone.dashboard.model.CollectorType collectorType, com.capitalone.dashboard.model.CollectorItem collectorItem) {
    if ((collectorItems.get(collectorType)) == null) {
        collectorItems.put(collectorType, java.util.Arrays.asList(collectorItem));
    }else {
        java.util.List<com.capitalone.dashboard.model.CollectorItem> existing = new java.util.ArrayList(collectorItems.get(collectorType));
        if (isNewCollectorItem(existing, collectorItem)) {
            existing.add(collectorItem);
            collectorItems.replace(collectorType, existing);
        }
    }
}