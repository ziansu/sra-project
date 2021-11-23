@org.springframework.web.bind.annotation.RequestMapping(value = "/groups/{id}/add")
public void addNewChildGroup(org.springframework.ui.Model model, @org.springframework.web.bind.annotation.PathVariable(value = "id")
java.lang.String id, @org.springframework.web.bind.annotation.RequestParam(value = "value")
java.lang.String groupName) {
    ch.hsr.smartmanager.data.DeviceGroup devGroup = new ch.hsr.smartmanager.data.DeviceGroup(org.springframework.web.util.HtmlUtils.htmlEscape(com.eclipsesource.json.Json.parse(groupName).asString()));
    deviceService.insertGroup(devGroup);
    devGroup = deviceService.findByName(org.springframework.web.util.HtmlUtils.htmlEscape(com.eclipsesource.json.Json.parse(groupName).asString()));
    deviceService.addGroupToGroup(id, devGroup.getId());
}