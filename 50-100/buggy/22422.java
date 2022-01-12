@java.lang.Override
public boolean hasControllerDefinitionChanged() {
    if (controllerDefinitionIsPresent) {
        if (!(org.openremote.controller.deployer.Version20ModelBuilder.checkControllerDefinitionExists(config))) {
            controllerDefinitionIsPresent = false;
            return true;
        }
        long lastModified = getControllerXMLTimeStamp();
        if (lastModified > (lastTimeStamp)) {
            lastTimeStamp = lastModified;
            return true;
        }
    }else {
        if (org.openremote.controller.deployer.Version20ModelBuilder.checkControllerDefinitionExists(config)) {
            controllerDefinitionIsPresent = true;
            return true;
        }
    }
    return false;
}