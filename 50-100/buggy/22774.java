public java.lang.String saveRegistration() {
    log.info("Saving the registration....");
    log.info(("name: " + (person.getSurname())));
    log.info(("dmis: " + (person.getDmisnumber())));
    log.info(("testing dmis:" + (dmis)));
    registrationService.create(person);
    log.info("Finished saving the info...");
    return "/admin/registration?faces-redirect=true";
}