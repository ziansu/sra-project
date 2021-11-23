@com.adswizz.controller.RequestMapping(value = "{id}", method = RequestMethod.PUT)
public org.springframework.http.ResponseEntity update(@com.adswizz.controller.RequestBody
com.adswizz.domain.dto.ScoreDTO scoreDTO) {
    try {
        com.adswizz.controller.ScoreController.LOGGER.debug(((("update score by ID: " + (scoreDTO.getId())) + " new value: ") + (scoreDTO.getScore())));
        return new org.springframework.http.ResponseEntity(scoreService.update(scoreDTO), org.springframework.http.HttpStatus.OK);
    } catch (com.adswizz.service.exception.ServiceException e) {
        return new com.adswizz.exception.ServiceExceptionHandler().handleMiscFailures(e);
    } catch (java.lang.RuntimeException ex) {
        return new com.adswizz.exception.ServiceExceptionHandler().handleAnyException(ex);
    }
}