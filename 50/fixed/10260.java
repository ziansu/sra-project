@java.lang.Override
public void run() {
    getHostData.availability = infoHelper.readAvailability(getHostData.hostName, getModuleData.availabilityUrl);
}