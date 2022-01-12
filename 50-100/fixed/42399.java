public double expectedUtilizationFor(com.linkedin.kafka.cruisecontrol.common.Resource resource) {
    if (resource.equals(Resource.DISK)) {
        if (_snapshotsByTime.isEmpty()) {
            return 0.0;
        }
        return _snapshotsByTime.get(0).utilizationFor(resource);
    }
    return (_accumulatedUtilization[resource.id()]) / (_snapshotsByTime.size());
}