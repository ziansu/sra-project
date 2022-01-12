@org.springframework.web.bind.annotation.RequestMapping(value = "/edittask", method = org.springframework.web.bind.annotation.RequestMethod.POST)
@org.springframework.web.bind.annotation.ResponseBody
public java.lang.String updateTask(com.great.cms.db.entity.Task task, org.springframework.validation.BindingResult result, @org.springframework.web.bind.annotation.RequestParam(value = "taskTypeId")
int taskType, @org.springframework.web.bind.annotation.RequestParam(value = "taskId")
int taskId) {
    java.lang.System.out.println(("MOST TROUBLED: " + taskId));
    com.great.cms.db.entity.TaskType tt = new com.great.cms.db.entity.TaskType();
    tt.setTaskTypeId(taskType);
    task.setTaskId(taskId);
    task.setTaskTypeId(tt);
    taskService.updateTask(task);
    return "{ \"success\" : true }";
}