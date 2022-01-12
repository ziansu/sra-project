@org.springframework.web.bind.annotation.RequestMapping(value = "protected/{code}/interactive-view-download")
public org.springframework.web.servlet.ModelAndView interactiveViewDownload(@org.springframework.web.bind.annotation.PathVariable(value = "code")
java.lang.String code) throws java.lang.Exception {
    java.lang.String userName = "";
    if (isHasPermissionForCollection(code)) {
        userName = getAuthenticatedUserName();
    }
    return getInteractiveViewDownload(code, userName);
}