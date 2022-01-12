@org.springframework.web.bind.annotation.RequestMapping(value = "/tasks/new", method = org.springframework.web.bind.annotation.RequestMethod.POST)
public java.lang.String addTask(@org.springframework.web.bind.annotation.ModelAttribute(value = "task")
pl.edu.uj.fais.wpz.msom.entities.Task task) {
    taskDao.add(task);
    return "redirect:/tasks";
}