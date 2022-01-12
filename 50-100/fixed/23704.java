@org.springframework.web.bind.annotation.RequestMapping(value = "/Create/{hostUserId}/{receivingUserId}", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public java.lang.String createChallenge(@org.springframework.web.bind.annotation.PathVariable(value = "hostUserId")
int hostUserId, @org.springframework.web.bind.annotation.PathVariable(value = "receivingUserId")
int receivingUserId) {
    challengeDao.create(hostUserId, receivingUserId);
    challengeHolder.setNeedUpdateActive(true);
    notifyClient(hostUserId);
    notifyClient(receivingUserId);
    entities.user.User hostUser = sessionsHolder.getUserById(hostUserId);
    entities.user.User receivingUser = sessionsHolder.getUserById(receivingUserId);
    mailTransport.sendMessage(strings.challengeCreatedSubject(hostUser), strings.challengeCreatedMessage(hostUser), receivingUser);
    return "redirect:/";
}