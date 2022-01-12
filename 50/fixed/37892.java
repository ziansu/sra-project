@org.springframework.web.bind.annotation.RequestMapping(value = "/getbyid.do")
@org.springframework.web.bind.annotation.ResponseBody
public java.lang.String getProjectById(int id) {
    com.myproject.model.Project project = this.projectService.getProjectById(id);
    return project.toString();
}