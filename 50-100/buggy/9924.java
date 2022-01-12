@java.lang.Override
public com.containersol.minimesos.state.State getState() {
    try {
        return com.containersol.minimesos.state.State.fromJSON(getStateInfoJSON().toString());
    } catch (com.fasterxml.jackson.core.JsonParseException | com.fasterxml.jackson.databind.JsonMappingException | com.mashape.unirest.http.exceptions.UnirestException e) {
        throw new com.containersol.minimesos.MinimesosException(("Could not retrieve state from Mesos Agent: " + (getName())), e.getCause());
    }
}