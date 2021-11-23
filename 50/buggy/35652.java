@net.codestory.http.annotations.Get(value = "actor?name=:actorName")
public java.lang.String getActorByName(java.lang.String actorName) {
    return mongoDbRepository.getActorByName(actorName).toString();
}