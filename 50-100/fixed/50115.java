@com.healthserviceapp.areas.patient.controllers.PostMapping(value = "/edit/{id}")
public java.lang.String editPatient(@com.healthserviceapp.areas.patient.controllers.PathVariable
java.lang.Long id, @javax.validation.Valid
@com.healthserviceapp.areas.patient.controllers.ModelAttribute
com.healthserviceapp.areas.patient.models.bindingModels.EditPatientBindingModel editPatientBindingModel, org.springframework.validation.BindingResult bindingResult) {
    if (bindingResult.hasErrors()) {
        return "patients/edit";
    }
    com.healthserviceapp.areas.users.entities.User user = ((com.healthserviceapp.areas.users.entities.User) (org.springframework.security.core.context.SecurityContextHolder.getContext().getAuthentication().getPrincipal()));
    editPatientBindingModel.setId(id);
    this.patientService.save(editPatientBindingModel, user);
    return "redirect:/patients";
}