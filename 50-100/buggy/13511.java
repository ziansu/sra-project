@org.springframework.web.bind.annotation.RequestMapping(value = "/{taskId}/add-to-current-sprint", method = org.springframework.web.bind.annotation.RequestMethod.PUT)
public org.springframework.http.ResponseEntity<java.lang.String> addTask(@org.springframework.web.bind.annotation.PathVariable
java.lang.Long taskId, @org.springframework.security.core.annotation.AuthenticationPrincipal
java.lang.Long userId) {
    try {
        tm.addTaskToSprint(userId, taskId, java.util.Calendar.getInstance());
        return new org.springframework.http.ResponseEntity("success", org.springframework.http.HttpStatus.OK);
    } catch (java.lang.Exception e) {
        com.taskmaster.controller.TaskController.logger.error("Error adding task to sprint: ", e);
        return new org.springframework.http.ResponseEntity((("{\"error\":\"" + (e.getMessage())) + "\"}"), org.springframework.http.HttpStatus.INTERNAL_SERVER_ERROR);
    }
}