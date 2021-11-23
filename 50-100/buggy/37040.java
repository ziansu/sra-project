public void createOrUpdateDevice(ch.hsr.smartmanager.data.Device device, org.eclipse.leshan.server.registration.Registration registration) {
    if (deviceRepo.existsByName(device.getName())) {
        ch.hsr.smartmanager.data.Device dev = deviceRepo.findByName(device.getName());
        dev.setRegId(registration.getId());
        deviceRepo.save(dev);
    }else {
        deviceRepo.insert(device);
    }
}