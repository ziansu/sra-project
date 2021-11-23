private org.springframework.web.servlet.ModelAndView getAdminPage(java.security.Principal principal, java.lang.String actionName) {
    org.apache.roller.weblogger.pojos.User user = userManager.getEnabledUserByUserName(principal.getName());
    java.util.Map<java.lang.String, java.lang.Object> myMap = new java.util.HashMap<>();
    myMap.put("menu", getMenu(user, ("/tb-ui/app/admin/" + actionName), "admin", WeblogRole.NOBLOGNEEDED));
    return tightblogModelAndView(actionName, myMap, user, null);
}