@org.springframework.web.bind.annotation.RequestMapping(method = org.springframework.web.bind.annotation.RequestMethod.POST)
public com.manjesh.collector.domain.Event addEvent(@org.springframework.web.bind.annotation.RequestBody
com.manjesh.collector.domain.Event event) {
    java.lang.System.out.println(("Ganesh ==>  " + (event.getOids().size())));
    return event;
}