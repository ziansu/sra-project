@dk.aau.ida8.controller.RequestMapping(value = "/{competitionID}/sign-up", method = RequestMethod.POST)
public java.lang.String signupLifterToCompetition(@dk.aau.ida8.controller.RequestParam(value = "id", required = false)
java.lang.Long id, @dk.aau.ida8.controller.PathVariable
long competitionID) {
    dk.aau.ida8.controller.Competition competition = competitionService.findOne(competitionID);
    dk.aau.ida8.controller.Lifter lifter = lifterService.findOne(id);
    competition.addParticipant(lifter);
    competitionService.save(competition);
    return ("redirect:/competition/" + (competition.getId())) + "/sign-up";
}