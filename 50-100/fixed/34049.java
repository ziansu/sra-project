@com.pjwards.aide.controller.conference.RequestMapping(method = RequestMethod.DELETE, value = "/{conference-id}/admin/days/{id}")
public java.lang.String delete(@com.pjwards.aide.controller.conference.PathVariable(value = "conference-id")
java.lang.Long conferenceId, @com.pjwards.aide.controller.conference.ModelAttribute(value = "currentUser")
com.pjwards.aide.domain.CurrentUser currentUser, @com.pjwards.aide.controller.conference.PathVariable(value = "id")
java.lang.Long id) throws com.pjwards.aide.exception.ConferenceNotFoundException, com.pjwards.aide.exception.ProgramDateNotFoundException {
    com.pjwards.aide.controller.conference.ConferenceProgramDateController.LOGGER.debug("Deleting program date : {}", id);
    com.pjwards.aide.domain.Conference conference = conferenceService.findById(conferenceId);
    if (currentUser == null) {
        return "redirect:/sign_in";
    }
    if (!(conference.isHost(currentUser.getUser()))) {
        return "error/403";
    }
    programDateService.deleteById(id);
    return ("redirect:/conferences/" + conferenceId) + "/admin/days";
}