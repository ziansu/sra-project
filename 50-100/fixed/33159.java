@com.google.api.server.spi.config.ApiMethod(name = "registerPilot")
public void registerPilot(@javax.inject.Named(value = "pilotId")
java.lang.String pilotId, @javax.inject.Named(value = "pilotName")
java.lang.String pilotName, @javax.inject.Named(value = "pilotPhone")
java.lang.String pilotPhone) {
    net.exent.flywithme.server.bean.Pilot pilot = fetchPilot(pilotId);
    if (pilot == null)
        pilot = new net.exent.flywithme.server.bean.Pilot().setId(pilotId);
    
    pilot.setName(pilotName).setPhone(pilotPhone);
    com.googlecode.objectify.ObjectifyService.ofy().save().entity(pilot).now();
}