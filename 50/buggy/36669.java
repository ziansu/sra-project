@org.springframework.web.bind.annotation.RequestMapping(value = "/groups/add", method = org.springframework.web.bind.annotation.RequestMethod.POST)
public void addNewRootGroup(org.springframework.ui.Model mode, @org.springframework.web.bind.annotation.RequestParam(value = "value")
java.lang.String groupName) {
    deviceService.insertGroup(new ch.hsr.smartmanager.data.DeviceGroup(org.springframework.web.util.HtmlUtils.htmlEscape(com.eclipsesource.json.Json.parse(groupName).asString())));
}