@org.springframework.web.bind.annotation.RequestMapping(value = "season", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public java.lang.String season(org.springframework.ui.Model model, @org.springframework.web.bind.annotation.RequestParam
int id) {
    org.launchcode.models.Season sea = seasonDao.findOne(id);
    java.util.List<org.launchcode.models.Schedule> schedules = sea.getSchedules();
    model.addAttribute("schedules", schedules);
    model.addAttribute("title", ("Games in Season " + (sea.getId())));
    return "schedule/index";
}