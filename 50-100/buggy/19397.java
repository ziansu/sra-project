private boolean addEventInfo(Process.Event e, com.hp.gagawa.java.elements.Body body) {
    addEventLink(e, body);
    body.appendChild(new com.hp.gagawa.java.elements.Br());
    addEventDescription(e, body);
    body.appendChild(new com.hp.gagawa.java.elements.Br());
    addEventTime(e, body);
    body.appendChild(new com.hp.gagawa.java.elements.Br());
    body.appendChild(new com.hp.gagawa.java.elements.Br());
    return true;
}