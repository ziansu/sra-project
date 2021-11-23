@org.springframework.web.bind.annotation.RequestMapping(value = "/delete/{id}", method = org.springframework.web.bind.annotation.RequestMethod.POST)
public java.lang.String delete(@org.springframework.web.bind.annotation.PathVariable
java.lang.Long id) {
    java.lang.Long registrationId = visitService.delete(id);
    return (org.jugbd.mnet.web.controller.VisitController.REDIRECT_REGISTER_VISITS_PAGE) + registrationId;
}