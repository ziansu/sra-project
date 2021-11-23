public static java.util.Optional<intellimate.izou.events.Event> createEvent(java.lang.String type, intellimate.izou.system.Identification source) {
    if ((type == null) || (type.isEmpty()))
        return java.util.Optional.empty();
    
    if (source == null)
        return java.util.Optional.empty();
    
    return java.util.Optional.of(new intellimate.izou.events.Event(type, source, new java.util.ArrayList<java.lang.String>()));
}