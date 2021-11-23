@org.springframework.web.bind.annotation.RequestMapping(value = "/data", method = org.springframework.web.bind.annotation.RequestMethod.GET, produces = "application/json")
public java.util.List<aug.manas.mtconnect.mdata.model.MachineData> data() throws aug.manas.mtconnect.mdata.exception.AgentNotAvailableException {
    logger.debug("Entering the data method corresponding to /data");
    logger.debug("Calling the mdataService's callAgent method");
    java.util.List<aug.manas.mtconnect.mdata.model.MachineData> alMachineData = mdataService.callAgent();
    logger.debug("Ouput of callAgent method is :: ", alMachineData);
    logger.debug("Leaving the data method corresponding to /data");
    return alMachineData;
}