@javax.ws.rs.POST
@javax.ws.rs.Consumes(value = javax.ws.rs.core.MediaType.APPLICATION_JSON)
@com.codahale.metrics.annotation.Timed
public de.thoffbauer.helloworld.server.Saying register(de.thoffbauer.helloworld.server.User user) {
    java.lang.String found = dao.findAddressByName(user.getName());
    if ((found != null) && (!(found.isEmpty()))) {
        dao.update(user);
        return new de.thoffbauer.helloworld.server.Saying(counter.incrementAndGet(), "Updated");
    }else {
        dao.insert(user);
        return new de.thoffbauer.helloworld.server.Saying(counter.incrementAndGet(), "Registered");
    }
}