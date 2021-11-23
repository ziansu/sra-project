@org.springframework.web.bind.annotation.RequestMapping(value = "/removeFromWhitelist", method = org.springframework.web.bind.annotation.RequestMethod.DELETE)
public void removeFromWhitelist(@org.springframework.web.bind.annotation.RequestParam(value = "appId")
final java.lang.String appId) {
    whiteList.remove(appId.toLowerCase());
}