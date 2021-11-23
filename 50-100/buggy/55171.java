@com.codecool.volunti.controller.PostMapping(value = "/profile/organisation/saveVideo")
@com.codecool.volunti.controller.ResponseBody
public java.lang.String saveVideo(@com.codecool.volunti.controller.RequestBody
com.codecool.volunti.model.OrganisationVideo editedOrganisationVideo, java.security.Principal principal) {
    log.info("saveVideo() method called ...");
    com.codecool.volunti.model.User user = userService.getByEmail(principal.getName());
    com.codecool.volunti.model.Organisation organisation = user.getOrganisation();
    com.codecool.volunti.model.OrganisationVideo organisationVideo = new com.codecool.volunti.model.OrganisationVideo();
    organisationVideo.setOrganisationId(organisation);
    organisationVideo.setEmbedCode(editedOrganisationVideo.getEmbedCode());
    organisationService.save(organisationVideo);
    return "profiles/organisation";
}