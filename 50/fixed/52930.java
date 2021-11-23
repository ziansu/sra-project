private void startJob(int deviceId) {
    com.wildflower.sensei.service.MotherNodeService.DeviceDataJob job = new com.wildflower.sensei.service.MotherNodeService.DeviceDataJob();
    deviceDataJobs.put(deviceId, job);
    publishProgress(deviceId, job);
}