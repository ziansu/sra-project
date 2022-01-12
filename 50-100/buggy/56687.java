@java.lang.Override
@org.springframework.transaction.annotation.Transactional(propagation = org.springframework.transaction.annotation.Propagation.REQUIRED)
public void addTemplate(net.webpasswordsafe.common.model.Template template) {
    java.util.Date now = new java.util.Date();
    java.lang.String action = "add template";
    net.webpasswordsafe.common.model.User loggedInUser = getLoggedInUser();
    template.setUser(loggedInUser);
    templateDAO.makePersistent(template);
    auditLogger.log(now, loggedInUser.getUsername(), net.webpasswordsafe.server.ServerSessionUtil.getIP(), action, templateTarget(template), true, "");
}