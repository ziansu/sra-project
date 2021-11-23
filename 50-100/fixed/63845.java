@org.springframework.web.bind.annotation.RequestMapping(value = "/add_event", method = org.springframework.web.bind.annotation.RequestMethod.POST, consumes = "application/json")
public void insertEvent(@org.springframework.web.bind.annotation.RequestBody
tai.server.persistance.model.Event event) throws org.springframework.expression.ParseException {
    org.springframework.security.core.Authentication auth = org.springframework.security.core.context.SecurityContextHolder.getContext().getAuthentication();
    java.lang.String id = auth.getName();
    if (!(id.equals("anonymousUser"))) {
        tai.server.persistance.model.User organiser = userRepository.findById(java.lang.Long.parseLong(id));
        event.setOrganiser(organiser);
        eventRepository.save(event);
        java.lang.System.out.println(event);
    }
}