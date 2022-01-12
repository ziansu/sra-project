@org.springframework.web.bind.annotation.RequestMapping(value = "/addVolunteer", method = org.springframework.web.bind.annotation.RequestMethod.POST)
public java.lang.String addVolunteer(@org.springframework.web.bind.annotation.ModelAttribute(value = "SpringWeb")
us.wasatchsystems.ccs.models.Volunteer volunteer, org.springframework.ui.ModelMap model) {
    model.addAttribute("firstName", volunteer.getFirstName());
    model.addAttribute("lastName", volunteer.getLastName());
    model.addAttribute("dob", volunteer.getDob());
    us.wasatchsystems.ccs.datasource.VolunteerDataSource.addVolunteer(volunteer);
    return "result";
}