@javax.ws.rs.POST
@javax.ws.rs.Consumes(value = "application/x-www-form-urlencoded")
@com.codahale.metrics.annotation.Timed
public de.thoffbauer.helloworld.server.Saying register(@javax.ws.rs.FormParam(value = "name")
@org.hibernate.validator.constraints.NotEmpty
java.lang.String name, @javax.ws.rs.FormParam(value = "address")
@org.hibernate.validator.constraints.NotEmpty
java.lang.String address) {
    de.thoffbauer.helloworld.server.User user = new de.thoffbauer.helloworld.server.User(name, address);
    java.lang.String found = dao.findAddressByName(name);
    if ((found != null) && (!(found.isEmpty()))) {
        dao.update(user);
        return new de.thoffbauer.helloworld.server.Saying(counter.incrementAndGet(), "Updated");
    }else {
        dao.insert(user);
        return new de.thoffbauer.helloworld.server.Saying(counter.incrementAndGet(), "Registered");
    }
}