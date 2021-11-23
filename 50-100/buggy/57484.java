public ch.renuo.hackzurich2016.models.Device findDeviceById(java.lang.String deviceId) {
    for (ch.renuo.hackzurich2016.models.Cluster cluster : _household.getClusters()) {
        for (ch.renuo.hackzurich2016.models.Device device : cluster.getDevices()) {
            if (device.getId().equals(deviceId)) {
                return device;
            }
        }
    }
    return null;
}