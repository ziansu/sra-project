@org.springframework.web.bind.annotation.RequestMapping(value = "task/changePriority", method = org.springframework.web.bind.annotation.RequestMethod.GET)
@org.springframework.web.bind.annotation.ResponseBody
public java.lang.String changePriority(java.security.Principal principal, @org.springframework.web.bind.annotation.RequestParam(value = "taskId")
java.lang.Long taskId, @org.springframework.web.bind.annotation.RequestParam(value = "priorityId")
java.lang.Long priority) {
    if (principal == null) {
        return "redirect:/accessDenied";
    }else {
        fr.projecthandler.model.Task t = taskService.findTaskById(taskId);
        t.setPriority(taskService.findTaskPriorityById(priority));
        try {
            taskService.updateTask(t);
        } catch (java.lang.Exception e) {
            e.printStackTrace();
            return "KO";
        }
    }
    return "OK";
}