@jodd.petite.meta.PetiteInitMethod
public void start() {
    tempGrabber = new ro.videanuadrian.smartHome.services.impl.TemperatureGrabber();
    tempGrabber.addObserver(dbTempLoggerListener);
    tempGrabThread = new java.lang.Thread(tempGrabber);
    ro.videanuadrian.smartHome.services.listeners.impl.InitService.logger.info("**************************");
    ro.videanuadrian.smartHome.services.listeners.impl.InitService.logger.info("*Starting TempGrabber    *");
    ro.videanuadrian.smartHome.services.listeners.impl.InitService.logger.info("*Successfully started    *");
    ro.videanuadrian.smartHome.services.listeners.impl.InitService.logger.info("**************************");
}