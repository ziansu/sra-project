@org.springframework.web.bind.annotation.RequestMapping(value = "/save", method = org.springframework.web.bind.annotation.RequestMethod.POST)
@org.springframework.security.access.prepost.PreAuthorize(value = "hasAnyRole('ADMIN', 'USER')")
public java.util.Map<java.lang.String, java.lang.Object> save(@javax.validation.Valid
@org.springframework.web.bind.annotation.RequestBody
gov.gsa.dcoi.dto.ValidList<gov.gsa.dcoi.dto.DataCenterDto> dataCenterDtos) {
    java.util.Map<java.lang.String, java.lang.Object> returnMap;
    returnMap = validationService.validateDataCenters(dataCenterDtos.getList());
    if (returnMap.containsKey("messageList")) {
        return returnMap;
    }
    dataCenterService.saveDataCenters(dataCenterDtos.getList(), securityController.getUserAccount());
    returnMap.put("dataCenterIdTotalsPairs", quarterService.costCalculation(dataCenterDtos.getList()));
    addSuccessData(returnMap, gov.gsa.dcoi.controllers.QuarterController.SAVE_SUCCESS);
    return returnMap;
}