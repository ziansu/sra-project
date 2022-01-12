@org.springframework.web.bind.annotation.RequestMapping(value = "/saveMachine", method = org.springframework.web.bind.annotation.RequestMethod.POST)
@org.springframework.web.bind.annotation.ResponseBody
public com.agg.application.model.Result saveMachine(@org.springframework.web.bind.annotation.RequestBody
com.agg.application.model.MachineDO machineDO, org.springframework.validation.BindingResult result, javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) {
    logger.debug(("In saveOrEditMachine with groupId: " + (machineDO.getGroupId())));
    com.agg.application.model.Result opResult = null;
    long id = machineService.saveMachineInfo(machineDO);
    if (id > 0) {
        opResult = new com.agg.application.model.Result("success", "Machine created successfully", null);
    }
    return opResult;
}