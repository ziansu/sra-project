private java.lang.String calculateStatus(org.traccar.model.Position position) {
    if ((position.getAttributes().containsKey(Event.KEY_ALARM)) && ((java.lang.Boolean) (position.getAttributes().get(Event.KEY_ALARM)))) {
        return "0xF841";
    }else
        if ((position.getSpeed()) < 1.0) {
            return "0xF020";
        }else {
            return "0xF11C";
        }
    
}