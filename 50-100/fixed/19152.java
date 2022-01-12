@org.springframework.web.bind.annotation.RequestMapping(method = org.springframework.web.bind.annotation.RequestMethod.PUT, value = "/{taskID}", consumes = { "application/xml" , "application/json" })
@io.swagger.annotations.ApiOperation(value = "Update Task", notes = "Updates a task with provided parameters")
public long updateTask(@org.springframework.web.bind.annotation.PathVariable
long userID, @org.springframework.web.bind.annotation.PathVariable
long taskID, @org.springframework.web.bind.annotation.RequestBody
com.epam.mentoring.webservices.bean.Task task) {
    com.epam.mentoring.webservices.bean.User user = userDAO.get(userID);
    if ((user != null) && ((taskDAO.get(taskID)) != null)) {
        task.setUser(user);
        task.setTaskID(taskID);
        taskDAO.save(task);
        return task.getTaskID();
    }else {
        return -1;
    }
}