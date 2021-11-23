public void removeService(java.lang.String cloudServiceId) {
    if ((!(cloudServiceId.equalsIgnoreCase(""))) && (controls.containsKey(cloudServiceId))) {
        controls.get(cloudServiceId).removeFromMonitoring();
        if ((controls.get(cloudServiceId)) != null) {
            controls.get(cloudServiceId).stop();
            controls.remove(cloudServiceId);
        }
    }
}