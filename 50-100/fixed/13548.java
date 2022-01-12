private de.yadrone.base.command.CommandManager initARDrone() {
    setMulticonfiguration();
    waitFor(5000);
    sendPMode(2);
    sendMisc(2, 20, 2000, 3000);
    freeze();
    landing();
    setOutdoor(false, false);
    setMaxAltitude(10000);
    setMaxVz(1000);
    setMaxEulerAngle(0.25F);
    return this;
}