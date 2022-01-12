@org.springframework.web.bind.annotation.RequestMapping(value = "filter/{type}/{typeValue}", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public java.util.List<org.openbox.sf5.model.Settings> getSettingsByArbitraryFilter(@org.springframework.web.bind.annotation.PathVariable(value = "type")
java.lang.String fieldName, @org.springframework.web.bind.annotation.PathVariable(value = "typeValue")
java.lang.String typeValue) {
    java.lang.System.out.println("Request all user settings by arbitrary filter	 called");
    java.util.List<org.openbox.sf5.model.Settings> settList = new java.util.ArrayList<>();
    org.openbox.sf5.model.Users currentUser = securityContext.getCurrentlyAuthenticatedUser();
    if (currentUser == null) {
        return settList;
    }
    settList = settingsJsonizer.getSettingsByArbitraryFilter(fieldName, typeValue, currentUser);
    return settList;
}