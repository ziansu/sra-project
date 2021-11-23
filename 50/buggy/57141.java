@java.lang.Override
public boolean create(ua.kobzev.theatre.domain.Event event) {
    int result = jdbcOperations.update("INSERT into events(name,basePrice,rate) VALUES (?,?,?)", event.getName(), event.getBasePrice(), event.getRate().name());
    return result == 0 ? false : true;
}