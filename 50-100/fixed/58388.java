@org.springframework.web.bind.annotation.RequestMapping(value = "/groups/{id}/add")
public java.lang.String addNewChildGroup(org.springframework.ui.Model model, @org.springframework.web.bind.annotation.PathVariable(value = "id")
java.lang.String id, @org.springframework.web.bind.annotation.RequestParam(value = "value")
java.lang.String groupName) {
    ch.hsr.smartmanager.data.DeviceGroup devGroup = deviceService.insertGroup(groupName);
    if (devGroup != null) {
        deviceService.addGroupToGroup(id, devGroup.getId());
        return java.lang.Boolean.toString(true);
    }else {
        return java.lang.Boolean.toString(false);
    }
}