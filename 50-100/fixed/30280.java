@org.springframework.web.bind.annotation.PostMapping(value = "/start")
public java.lang.String startSimulation(org.springframework.ui.Model model, @org.springframework.web.bind.annotation.RequestBody
org.springframework.util.MultiValueMap<java.lang.String, java.lang.String> formData) throws java.io.IOException {
    lapesd.saturnus.simulator.SimulationController simulation = new lapesd.saturnus.simulator.SimulationController();
    java.util.ArrayList subRequestsInfo = simulation.initSimulation(formData.toSingleValueMap());
    subRequestsInfo.sort(new lapesd.saturnus.dataStructures.AttTimeComparator());
    model.addAttribute("eventInfo", subRequestsInfo);
    return "simulation";
}