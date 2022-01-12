public void unmap(int hardwareId) {
    mMap.delete(hardwareId);
    for (java.util.Map.Entry<java.lang.String, java.lang.Integer> entry : deviceNameToId.entrySet()) {
        if ((entry.getValue()) == hardwareId) {
            deviceNameToId.remove(entry.getKey());
            break;
        }
    }
}