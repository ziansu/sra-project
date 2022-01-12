@org.springframework.web.bind.annotation.RequestMapping(value = "/bets", method = org.springframework.web.bind.annotation.RequestMethod.POST, produces = org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
public org.springframework.http.ResponseEntity<java.lang.Void> bet(@javax.validation.Valid
@org.springframework.web.bind.annotation.RequestBody
java.util.List<de.meonwax.dto.BetDto> betDtos) {
    if (betDtos.isEmpty()) {
        return org.springframework.http.ResponseEntity.badRequest().build();
    }
    for (de.meonwax.dto.BetDto betDto : betDtos) {
        log.info(betDto);
    }
    return org.springframework.http.ResponseEntity.noContent().build();
}