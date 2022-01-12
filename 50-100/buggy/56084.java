public org.springframework.http.ResponseEntity<ch.heigvd.amt.gamification.dto.EventPresentationDTO> eventsPost(@ch.heigvd.amt.gamification.api.ApiParam(value = "Application token", required = true)
@org.springframework.web.bind.annotation.RequestHeader(value = "Authorization", required = true)
java.lang.String authorization, @ch.heigvd.amt.gamification.api.ApiParam(value = "New event", required = true)
@org.springframework.web.bind.annotation.RequestBody
ch.heigvd.amt.gamification.dto.EventCreationDTO eventDTO) {
    dataValidation(eventDTO);
    ch.heigvd.amt.gamification.api.Event event = new ch.heigvd.amt.gamification.api.Event(new java.util.Date(), eventDTO.getUser_id(), eventtypeDao.findById(eventDTO.getEventtype_id()), applicationDao.findById(ch.heigvd.amt.gamification.security.Authentication.getApplicationId(authorization)));
    eventDao.save(event);
    return new org.springframework.http.ResponseEntity<ch.heigvd.amt.gamification.dto.EventPresentationDTO>(new ch.heigvd.amt.gamification.dto.EventPresentationDTO(event), org.springframework.http.HttpStatus.OK);
}