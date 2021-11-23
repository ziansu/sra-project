@org.dimazay.tkgteammanagement.rest.resources.RequestMapping(path = "/{eventId}/participations", method = RequestMethod.GET)
public org.springframework.http.ResponseEntity<org.dimazay.tkgteammanagement.model.participation.Participation> getAllEventParticipations(@org.dimazay.tkgteammanagement.rest.resources.PathVariable(value = "eventId")
java.lang.String eventId) {
    org.dimazay.tkgteammanagement.model.participation.Participation participation = participationRepository.findByEventId(new org.bson.types.ObjectId(eventId));
    return new org.springframework.http.ResponseEntity(participation, org.springframework.http.HttpStatus.OK);
}