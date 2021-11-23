@org.springframework.web.bind.annotation.RequestMapping(value = "/{id}/reopen", method = org.springframework.web.bind.annotation.RequestMethod.PUT)
public org.springframework.http.ResponseEntity<java.lang.Object> reopenTask(@org.springframework.web.bind.annotation.PathVariable
java.lang.Long id) {
    try {
        return new org.springframework.http.ResponseEntity(tm.reopenTask(id), org.springframework.http.HttpStatus.OK);
    } catch (java.lang.Exception e) {
        com.taskmaster.controller.TaskController.logger.error(("Error occurred while reopening task = " + id), e);
        return new org.springframework.http.ResponseEntity((("{\"error\":\"" + (e.getMessage())) + "\"}"), org.springframework.http.HttpStatus.INTERNAL_SERVER_ERROR);
    }
}