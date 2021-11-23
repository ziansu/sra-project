@java.lang.Override
public void run() {
    try {
        getHostData.availability = infoHelper.readAvailability(getHostData.hostName, getModuleData.availabilityUrl);
    } catch (java.io.IOException ex) {
    }
}