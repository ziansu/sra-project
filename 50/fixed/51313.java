@com.atrinet.web.controller.RequestMapping(value = "/id/{serviceId}", method = RequestMethod.GET)
@com.atrinet.web.controller.ResponseStatus(value = org.springframework.http.HttpStatus.OK)
@com.atrinet.web.controller.ResponseBody
public java.util.List<com.atrinet.service.model.AtrService> getServiceById(@com.atrinet.web.controller.PathVariable
java.lang.Integer serviceId) {
    return serviceManager.getServiceById(serviceId);
}