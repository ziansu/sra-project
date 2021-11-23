@ee.pardiralli.web.GetMapping(value = "/settings")
public java.lang.String settings(org.springframework.ui.Model model) {
    java.lang.Boolean isRaceOpen = false;
    java.lang.Iterable<ee.pardiralli.domain.Race> races = raceRepository.findAll();
    for (ee.pardiralli.domain.Race r : races) {
        if ((r.getFinish()) == null)
            isRaceOpen = true;
        
    }
    model.addAttribute("settings", new ee.pardiralli.domain.Settings(isRaceOpen));
    return "settings";
}