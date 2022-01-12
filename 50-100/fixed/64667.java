@org.springframework.web.bind.annotation.RequestMapping(value = { "/update" })
@org.springframework.web.bind.annotation.ResponseBody
public com.bcbssc.drdre.model.Event updateEvent(@org.springframework.web.bind.annotation.RequestParam(required = true)
long EventId, @org.springframework.web.bind.annotation.RequestParam(required = true)
java.lang.String newName, @org.springframework.web.bind.annotation.RequestParam(required = true)
java.lang.String owner, org.springframework.ui.ModelMap map) {
    if (com.bcbssc.drdre.controller.api.EventAPIController.log.isInfoEnabled())
        com.bcbssc.drdre.controller.api.EventAPIController.log.info((((("/api/event/search?EventId=" + EventId) + "&newName=") + newName) + " invoked"));
    
    com.bcbssc.drdre.model.Event s = eventsvc.getEvent(EventId);
    s.setName(newName);
    s.setOwner(owner);
    return eventsvc.updateEvent(s);
}