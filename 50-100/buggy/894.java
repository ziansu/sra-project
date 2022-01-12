@org.springframework.web.bind.annotation.RequestMapping(value = "/{search}", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public java.lang.String iconSearch(org.springframework.ui.Model model, @org.springframework.web.bind.annotation.PathVariable(value = "search")
java.lang.String search, javax.servlet.http.HttpSession session) {
    session.setAttribute("mainsearch", search);
    model.addAttribute("search", new com.medico.swiftcure.model.NavigatorSearch());
    model.addAttribute("appointment", new com.medico.swiftcure.model.Appointment());
    model.addAttribute("specializationList", specializationService.getAll());
    model.addAttribute("locationList", locationService.getAll());
    int from = 1;
    model.addAttribute("doctorsList", searchService.mainSearchPaginated(search, from));
    return "searchdoctorlist";
}