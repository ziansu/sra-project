@com.adswizz.controller.RequestMapping(value = "{id}", method = RequestMethod.PUT)
public org.springframework.http.ResponseEntity update(@com.adswizz.controller.RequestBody
com.adswizz.domain.dto.ScoreDTO scoreDTO) throws com.adswizz.service.exception.ServiceException {
    com.adswizz.controller.ScoreController.LOGGER.debug(((("update score by ID: " + (scoreDTO.getId())) + " new value: ") + (scoreDTO.getScore())));
    return new org.springframework.http.ResponseEntity(scoreService.update(scoreDTO), org.springframework.http.HttpStatus.OK);
}