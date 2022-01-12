@ee.pardiralli.web.RequestMapping(value = "/settings", method = RequestMethod.GET)
public java.lang.String settings(org.springframework.ui.Model model) {
    java.lang.Boolean isRaceOpen = false;
    ee.pardiralli.domain.Race currentRace = null;
    java.lang.Iterable<ee.pardiralli.domain.Race> races = raceRepository.findAll();
    for (ee.pardiralli.domain.Race r : races) {
        if ((r.getFinish()) == null) {
            isRaceOpen = true;
            currentRace = r;
        }
    }
    model.addAttribute("settings", new ee.pardiralli.domain.Settings(isRaceOpen, currentRace));
    return "settings";
}