@org.springframework.web.bind.annotation.RequestMapping(value = "/wiki/add", method = org.springframework.web.bind.annotation.RequestMethod.POST)
public java.lang.String wikiAdd(@org.springframework.web.bind.annotation.RequestParam(value = "group")
long groupId, @org.springframework.web.bind.annotation.RequestParam
java.lang.String name, @org.springframework.web.bind.annotation.RequestParam
java.lang.String description, @org.springframework.web.bind.annotation.RequestParam
java.lang.String url, @org.springframework.web.bind.annotation.RequestParam
@org.springframework.format.annotation.DateTimeFormat(pattern = "yyyy-MM-dd")
java.util.Date date, org.springframework.ui.Model model) {
    com.ccentre.controller.Group group = (groupId != (com.ccentre.controller.MyController.DEFAULT_GROUP_ID)) ? wikiService.findGroup(groupId) : null;
    com.ccentre.controller.Wiki wiki = new com.ccentre.controller.Wiki(group, name, description, url, date);
    wikiService.add(wiki);
    model.addAttribute("groups", wikiService.listGroups());
    model.addAttribute("wikis", wikiService.list());
    return "redirect:/wiki";
}