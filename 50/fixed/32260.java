@com.fasterxml.jackson.annotation.JsonCreator
static com.spotify.docker.client.messages.swarm.ManagerStatus create(@com.fasterxml.jackson.annotation.JsonProperty(value = "Leader")
final java.lang.Boolean leader, @com.fasterxml.jackson.annotation.JsonProperty(value = "Reachability")
final java.lang.String reachability, @com.fasterxml.jackson.annotation.JsonProperty(value = "Addr")
final java.lang.String address) {
    return new com.spotify.docker.client.messages.swarm.AutoValue_ManagerStatus(leader, reachability, address);
}