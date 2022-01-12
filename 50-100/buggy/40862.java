@org.springframework.web.bind.annotation.PostMapping(value = "/portcalls/add")
public boolean addPortCall(@org.springframework.web.bind.annotation.RequestBody
softproject.model.PortCall newPortCall) {
    softproject.services.LocationRegistryService ls = new softproject.services.LocationRegistryService(softproject.services.PortCDMRequest.getClientInstance(), softproject.services.PortCDMRequest.getBaseRequest());
    boolean exist = ls.doesLocationMRNExist(((softproject.controllers.PortCallController.BERTH_BASE) + (newPortCall.getBerth())));
    if (!exist) {
        java.lang.System.out.println("Invalid location URN!");
        return false;
    }
    softproject.model.PortCallRepository.getRepo().add(newPortCall);
    return true;
}