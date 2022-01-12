@org.springframework.web.bind.annotation.GetMapping(value = "/dashboard")
public java.lang.String dashboard(org.springframework.ui.Model model, org.innovateuk.ifs.user.resource.UserResource user) {
    model.addAttribute("model", applicantDashboardPopulator.populate(user.getId()));
    return "applicant-dashboard";
}