public void unmap(int hardwareId) {
    mMap.delete(hardwareId);
    for (java.util.Map.Entry<java.lang.String, java.util.Collection<java.lang.Integer>> entry : deviceNameToId.entrySet()) {
        for (java.lang.Integer id : entry.getValue()) {
            if (id == hardwareId) {
                entry.getValue().remove(hardwareId);
                return ;
            }
        }
    }
}