private void replaceAnnotations(java.util.Map<java.lang.String, java.lang.String> annotations, java.util.Map<java.lang.String, java.lang.String> newMapping) {
    for (java.lang.String annotation : annotations.keySet()) {
        if ((newMapping.get(annotation)) != null) {
            annotations.put(newMapping.get(annotation), annotations.get(annotation));
            annotations.remove(annotation);
        }
    }
}