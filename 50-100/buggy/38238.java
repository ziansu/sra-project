@org.springframework.scheduling.annotation.Scheduled(cron = "0/10 * * * * ?")
public void run() {
    try {
        com.insidecoding.opium.agent.job.InspectDevicesJob.LOG.info("Runing get devices...");
        java.lang.String devicesListCommandOut = adbCommand.execute("devices", "-l");
        java.util.List<com.insidecoding.opium.agent.entity.Device> devices = this.getDevices(devicesListCommandOut);
        com.insidecoding.opium.agent.job.InspectDevicesJob.LOG.info(("Got devices: " + devices));
        if ((devices.size()) > 0) {
            netService.sendToMaster(devices);
        }
    } catch (java.lang.Exception e) {
        com.insidecoding.opium.agent.job.InspectDevicesJob.LOG.warn(("Something went wrong while getting devices: " + (e.getMessage())));
    }
}