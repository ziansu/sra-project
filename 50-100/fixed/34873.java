public static java.lang.String getStoredInfo(java.lang.String index, java.lang.String username) {
    try {
        return com.helen.database.Pages.getPageInfo(com.helen.database.Pages.titleToPageName.get(com.helen.database.Pages.storedEvents.get(username).get(((java.lang.Integer.parseInt(index)) - 1))));
    } catch (java.lang.Exception e) {
        com.helen.database.Pages.logger.error("There was an exception getting stored info", e);
    }
    return "Either the command was malformed, or I have nothing for you to get.";
}