@org.springframework.web.bind.annotation.RequestMapping(path = org.dataarc.web.UrlConstants.ADMIN_MAKE_ADMIN, method = org.springframework.web.bind.annotation.RequestMethod.POST)
public boolean makeAdmin(@org.springframework.web.bind.annotation.RequestParam(value = "id", required = true)
java.lang.String userId) throws java.lang.Exception {
    try {
        userService.makeAdmin(userId);
    } catch (java.lang.Exception e) {
        logger.error("{}", e, e);
        return false;
    }
    return true;
}