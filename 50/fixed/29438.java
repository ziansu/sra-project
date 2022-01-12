@org.springframework.web.bind.annotation.RequestMapping(value = "/{flickrId}/ignoreSize/{ignoreSize}", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public net.thecamaras.domain.User setIgnoreSize(@org.springframework.web.bind.annotation.PathVariable
java.lang.String flickrId, @org.springframework.web.bind.annotation.PathVariable
boolean ignoreSize) {
    net.thecamaras.domain.User user = getUser(flickrId);
    user.setIgnoreSizeCheck(ignoreSize);
    return userService.save(user);
}