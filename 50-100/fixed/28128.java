@org.springframework.web.bind.annotation.PostMapping
@org.springframework.web.bind.annotation.ResponseStatus(value = org.springframework.http.HttpStatus.CREATED)
public void save(@org.springframework.web.bind.annotation.RequestBody
nl.wiegman.home.api.dto.Dsmr42ReadingDto slimmeMeterBericht) {
    try {
        nl.wiegman.home.api.SlimmeMeterServiceRest.LOG.info(objectMapper.writeValueAsString(slimmeMeterBericht));
    } catch (com.fasterxml.jackson.core.JsonProcessingException e) {
        nl.wiegman.home.api.SlimmeMeterServiceRest.LOG.warn("Failed to serialize recieved object", e);
    }
    meterstandService.save(mapToMeterStand(slimmeMeterBericht));
}