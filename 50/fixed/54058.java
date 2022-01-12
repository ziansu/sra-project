@org.springframework.web.bind.annotation.RequestMapping(value = "/tasks/remove/{id}", method = org.springframework.web.bind.annotation.RequestMethod.POST)
public java.lang.String deleteTask(@org.springframework.web.bind.annotation.PathVariable(value = "id")
long id) {
    pl.edu.uj.fais.wpz.msom.entities.Task toDelete = taskService.find(id);
    boolean wasDeleted = taskService.remove(toDelete);
    if (!wasDeleted) {
    }
    return "redirect:/tasks";
}