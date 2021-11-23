@org.springframework.web.bind.annotation.RequestMapping(value = "delete", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public java.lang.String deleteEmployeeFromWorkEvent(@org.springframework.web.bind.annotation.RequestParam(value = "id")
java.lang.Integer id) {
    ru.kolaer.permit.entity.WorkEvent workEvent = this.workEventDao.findById(id, false);
    workEvent.setId(id);
    final int permitId = workEvent.getPermitId();
    this.workEventDao.delete(workEvent, true);
    return "redirect:/permit/edit/event?id=" + permitId;
}