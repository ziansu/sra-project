@org.springframework.web.bind.annotation.RequestMapping(value = "/{clientid}/enrollments/{enrollmentid}/exits/{exitid}/exitpaths", method = org.springframework.web.bind.annotation.RequestMethod.GET)
@com.servinglynk.hmis.warehouse.annotations.APIMapping(value = "CLIENT_API_GET_ALL_EXIT_EXITPATHS", checkTrustedApp = true, checkSessionToken = true)
public com.servinglynk.hmis.warehouse.core.model.Exitpaths getAllEnrollmentExitpaths(@org.springframework.web.bind.annotation.PathVariable(value = "clientid")
java.util.UUID clientId, @org.springframework.web.bind.annotation.PathVariable(value = "enrollmentid")
java.util.UUID enrollmentId, @org.springframework.web.bind.annotation.PathVariable(value = "exitid")
java.util.UUID exitId, @org.springframework.web.bind.annotation.RequestParam(value = "startIndex", required = false)
java.lang.Integer startIndex, @org.springframework.web.bind.annotation.RequestParam(value = "maxItems", required = false)
java.lang.Integer maxItems, javax.servlet.http.HttpServletRequest request) throws java.lang.Exception {
    if (startIndex == null)
        startIndex = 0;
    
    if (maxItems == null)
        maxItems = 30;
    
    serviceFactory.getClientService().getClientById(clientId);
    serviceFactory.getEnrollmentService().getEnrollmentByClientIdAndEnrollmentId(enrollmentId, clientId);
    serviceFactory.getExitService().getExitById(exitId);
    return serviceFactory.getExitpathService().getAllExitExitpaths(exitId, startIndex, maxItems);
}