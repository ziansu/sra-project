@org.springframework.web.bind.annotation.RequestMapping(value = "/{id}/complete", method = org.springframework.web.bind.annotation.RequestMethod.PUT)
public org.springframework.http.ResponseEntity<java.lang.String> completeTask(@org.springframework.web.bind.annotation.PathVariable
java.lang.Long id) {
    try {
        tm.completeTask(id);
        return new org.springframework.http.ResponseEntity("success", org.springframework.http.HttpStatus.OK);
    } catch (java.lang.Exception e) {
        com.taskmaster.controller.TaskController.logger.error((("Error occurred while marking task = " + id) + " complete: "), e);
        return new org.springframework.http.ResponseEntity((("{\"error\":\"" + (e.getMessage())) + "\"}"), org.springframework.http.HttpStatus.INTERNAL_SERVER_ERROR);
    }
}