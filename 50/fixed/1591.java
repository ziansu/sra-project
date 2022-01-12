@org.springframework.web.bind.annotation.RequestMapping(value = "requestDeletePatient/{id}", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public org.springframework.web.servlet.ModelAndView requestDeletePatient(@org.springframework.web.bind.annotation.PathVariable
long id) {
    return new org.springframework.web.servlet.ModelAndView("deletePatientConfirmation", "patient", service.find(id));
}