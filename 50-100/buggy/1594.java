@org.springframework.web.bind.annotation.PostMapping(value = "/addAppointment")
public java.lang.String addAppointment(@javax.validation.Valid
com.medman.controllers.AppointmentTime appointmentTime, org.springframework.validation.Errors validation, org.springframework.ui.Model model) {
    if (validation.hasErrors()) {
        model.addAttribute("errors", validation);
        model.addAttribute("appointment", appointmentTime);
        return "shared/dashboard";
    }
    appointmentTime.setUser(loggedInUser());
    appointmentsDao.save(appointmentTime);
    return "redirect:/dashboard";
}