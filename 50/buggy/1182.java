@org.springframework.web.bind.annotation.RequestMapping(value = "/devices/{id}/add", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public java.lang.String addDevice(org.springframework.ui.Model model, @org.springframework.web.bind.annotation.PathVariable(value = "id")
java.lang.String id) {
    java.lang.System.out.println(id);
    deviceService.addToManagement(id);
    return "redirect:/discovery";
}