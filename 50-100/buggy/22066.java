@com.adswizz.controller.RequestMapping(method = RequestMethod.POST)
public org.springframework.http.ResponseEntity create(@com.adswizz.controller.RequestBody
com.adswizz.domain.dto.ScoreDTO score) {
    try {
        com.adswizz.controller.ScoreController.LOGGER.debug(((("insert score: " + (score.getId())) + " ") + (score.getScore())));
        return new org.springframework.http.ResponseEntity(scoreService.save(score), org.springframework.http.HttpStatus.OK);
    } catch (com.adswizz.service.exception.ServiceException e) {
        return new com.adswizz.exception.ServiceExceptionHandler().handleMiscFailures(e);
    } catch (java.lang.RuntimeException ex) {
        return new com.adswizz.exception.ServiceExceptionHandler().handleAnyException(ex);
    }
}