public static org.javarosa.services.transport.TransportMessage retrieve(java.lang.String id) {
    return org.javarosa.services.transport.TransportService.CACHE.findMessage(id);
}