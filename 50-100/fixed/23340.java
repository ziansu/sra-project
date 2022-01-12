protected java.util.Map<ar.edu.itba.paw.model.ResourceType, java.lang.String> getFormattedOutputs() {
    java.util.Map<ar.edu.itba.paw.model.ResourceType, java.lang.String> map = new java.util.HashMap<>();
    for (ar.edu.itba.paw.model.ResourceType res : getResources()) {
        java.lang.Double value = resources.get(res);
        if (value > 0)
            map.put(res, formatter.format(value));
        
    }
    return map;
}