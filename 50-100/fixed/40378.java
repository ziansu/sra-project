@org.springframework.web.bind.annotation.RequestMapping(value = (za.org.grassroot.webapp.controller.ussd.USSDGroupController.groupPath) + (za.org.grassroot.webapp.controller.ussd.USSDGroupController.createGroupMenu))
@org.springframework.web.bind.annotation.ResponseBody
public za.org.grassroot.webapp.model.ussd.AAT.Request createPrompt(@org.springframework.web.bind.annotation.RequestParam(value = phoneNumber, required = true)
java.lang.String inputNumber) throws java.net.URISyntaxException {
    za.org.grassroot.core.domain.User sessionUser = userManager.findByInputNumber(inputNumber, ((groupMenus) + (za.org.grassroot.webapp.controller.ussd.USSDGroupController.createGroupMenu)));
    return menuBuilder(ussdGroupUtil.createGroupPrompt(sessionUser, za.org.grassroot.webapp.controller.ussd.USSDGroupController.thisSection, ((za.org.grassroot.webapp.controller.ussd.USSDGroupController.createGroupMenu) + (doSuffix))));
}