private boolean captureSeleniumCommands() {
    if (((properties.getProperty("captureSeleniumCommands")) != null) && ("true".equals(properties.getProperty("captureSeleniumCommands"))))
        return true;
    else
        return false;
    
}