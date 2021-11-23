@javax.ws.rs.GET
public java.util.List<org.glen.mccarthy.messenger.model.Message> getMessages(@javax.ws.rs.QueryParam(value = "year")
int year, @javax.ws.rs.QueryParam(value = "start")
java.lang.Integer start, @javax.ws.rs.QueryParam(value = "size")
java.lang.Integer size) {
    if (year > 0)
        return service.getAllMessagesForYear(year);
    
    if ((start != null) && (size != null))
        return service.getAllMessagesPaginated(start, size);
    
    return service.getAllMessages();
}