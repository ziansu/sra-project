public static se.blinfo.events.core.domain.Event.Form find(java.lang.String s) {
    if ((s.toUpperCase().equals("E")) || (s.toLowerCase().startsWith("elektr"))) {
        return se.blinfo.events.core.domain.Event.Form.E;
    }else
        if ((s.toUpperCase().equals("P")) || (s.toLowerCase().startsWith("papper"))) {
            return se.blinfo.events.core.domain.Event.Form.P;
        }else {
            return null;
        }
    
}