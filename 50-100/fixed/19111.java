@org.springframework.web.bind.annotation.RequestMapping(value = "/projects/{idProject}/states/{idState}/update", method = org.springframework.web.bind.annotation.RequestMethod.POST)
public java.lang.String updateHistoryProject(@javax.validation.Valid
@org.springframework.web.bind.annotation.ModelAttribute(value = "historyProject")
es.udc.rs.app.client.dto.HistoryProjectDTO historyProjectDTO, org.springframework.validation.BindingResult result, @org.springframework.web.bind.annotation.PathVariable
java.lang.String idProject, @org.springframework.web.bind.annotation.PathVariable
java.lang.String idState, org.springframework.ui.Model model) throws es.udc.rs.app.exceptions.InputValidationException, es.udc.rs.app.exceptions.InstanceNotFoundException {
    es.udc.rs.app.model.domain.HistoryProject hp = es.udc.rs.app.client.conversor.HistoryProjectDTOConversor.toHistoryProject(historyProjectDTO);
    projectService.updateHistoryProject(hp);
    return showHistoryProject(idProject, model);
}