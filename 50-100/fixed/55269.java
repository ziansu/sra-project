@org.springframework.web.bind.annotation.RequestMapping(value = (za.org.grassroot.webapp.controller.ussd.USSDGroupController.groupPath) + (startMenu))
@org.springframework.web.bind.annotation.ResponseBody
public za.org.grassroot.webapp.model.ussd.AAT.Request groupList(@org.springframework.web.bind.annotation.RequestParam(value = phoneNumber, required = true)
java.lang.String inputNumber, @org.springframework.web.bind.annotation.RequestParam(value = "interrupted", required = false)
boolean interrupted) throws java.net.URISyntaxException {
    za.org.grassroot.core.domain.User sessionUser = (interrupted) ? userManager.findByInputNumber(inputNumber, null) : userManager.findByInputNumber(inputNumber);
    return menuBuilder(ussdGroupUtil.askForGroupAllowCreateNew(sessionUser, USSDSection.GROUP_MANAGER, za.org.grassroot.webapp.controller.ussd.USSDGroupController.existingGroupMenu, za.org.grassroot.webapp.controller.ussd.USSDGroupController.createGroupMenu, ((za.org.grassroot.webapp.controller.ussd.USSDGroupController.createGroupMenu) + (doSuffix)), null, false));
}