private void addUserActivities(org.springframework.ui.Model model, java.lang.String userToken) {
    if ((net.whydah.sso.user.helpers.UserTokenXpathHelper.getUserID(userToken).length()) > 2) {
        try {
            java.net.URI reportServiceUri = javax.ws.rs.core.UriBuilder.fromUri(reportservice).build();
            java.lang.String userid = net.whydah.sso.user.helpers.UserTokenXpathHelper.getUserID(userToken);
            java.lang.String userActivitiesJson = new net.whydah.sso.commands.extensions.statistics.CommandListUserLogins(reportServiceUri, "", "", userid).execute();
            model.addAttribute(ModelHelper.USERACTIVITIES, userActivitiesJson);
        } catch (java.lang.Exception e) {
        }
    }
}