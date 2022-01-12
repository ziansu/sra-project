@org.springframework.web.bind.annotation.RequestMapping(value = "projects/{id}/editCollaborators")
public java.lang.String editCollaborators(org.springframework.ui.Model model, @org.springframework.web.bind.annotation.PathVariable
java.lang.Long id) {
    com.teamtreehouse.instateam.model.Project project = projectService.findById(id);
    java.util.List<com.teamtreehouse.instateam.model.Collaborator> collaborators = collaboratorService.findAll();
    model.addAttribute("project", project);
    model.addAttribute("collaborators", collaborators);
    model.addAttribute("rolesNeeded", project.getRolesNeeded());
    model.addAttribute("cancel", java.lang.String.format("/projects/%s", id));
    return "project/project_collaborators";
}