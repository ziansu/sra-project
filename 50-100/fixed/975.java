@org.springframework.web.bind.annotation.RequestMapping(value = (za.org.grassroot.webapp.controller.ussd.USSDVoteController.path) + "new")
@org.springframework.web.bind.annotation.ResponseBody
public za.org.grassroot.webapp.model.ussd.AAT.Request newVote(@org.springframework.web.bind.annotation.RequestParam(value = phoneNumber)
java.lang.String inputNumber) throws java.net.URISyntaxException {
    za.org.grassroot.core.domain.User user = userManager.findByInputNumber(inputNumber, ((voteMenus) + "new"));
    java.lang.String groupsExistPrompt = getMessage(za.org.grassroot.webapp.controller.ussd.USSDVoteController.thisSection, "group", promptKey, user);
    java.lang.String groupsDontExistPrompt = getMessage(za.org.grassroot.webapp.controller.ussd.USSDVoteController.thisSection, "group", ((promptKey) + "-nogroup"), user);
    return menuBuilder(ussdGroupUtil.askForGroupNoInlineNew(user, za.org.grassroot.webapp.controller.ussd.USSDVoteController.thisSection, groupsExistPrompt, groupsDontExistPrompt, "issue", ((groupMenus) + "create"), null, false));
}