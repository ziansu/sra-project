@java.lang.Override
public boolean assignAuditorium(ua.kobzev.theatre.domain.Event event, ua.kobzev.theatre.domain.Auditorium auditorium, java.time.LocalDateTime date) {
    if (isEventAssigned(event, auditorium, date))
        return false;
    
    int result = jdbcOperations.update("INSERT into assignedevent(eventname,auditoriumname,date) VALUES (?,?,?)", event.getName(), auditorium.getName(), date);
    return result == 0 ? false : true;
}