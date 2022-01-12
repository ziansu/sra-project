@javax.ws.rs.GET
public java.util.List<org.glen.mccarthy.messenger.model.Message> getMessages(@javax.ws.rs.QueryParam(value = "year")
int year, @javax.ws.rs.QueryParam(value = "start")
int start, @javax.ws.rs.QueryParam(value = "size")
int size) {
    if (year > 0)
        return service.getAllMessagesForYear(year);
    
    if ((start >= 0) && (size >= 0))
        return service.getAllMessagesPaginated(start, size);
    
    return service.getAllMessages();
}