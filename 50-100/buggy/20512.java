@org.springframework.web.bind.annotation.RequestMapping(value = "add/employee", method = org.springframework.web.bind.annotation.RequestMethod.POST, consumes = org.springframework.http.MediaType.APPLICATION_FORM_URLENCODED_VALUE, produces = { org.springframework.http.MediaType.APPLICATION_ATOM_XML_VALUE , org.springframework.http.MediaType.APPLICATION_JSON_VALUE })
public java.lang.String addEmployeeWorkEvent(ru.kolaer.permit.entity.WorkEvent workEvent) {
    final ru.kolaer.permit.entity.WorkEvent updatable = this.workEventDao.findById(workEvent.getId(), false);
    updatable.getEmployeesEntity().addAll(workEvent.getEmployeesEntity());
    this.workEventDao.update(updatable);
    return "redirect:/event/edit?id=" + (updatable.getId());
}