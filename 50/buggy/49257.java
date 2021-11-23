@javax.ws.rs.POST
@javax.ws.rs.Path(value = "/{tag}/{note}/{date}")
public java.lang.String addDateNote(@javax.ws.rs.PathParam(value = "tag")
java.lang.String tag, @javax.ws.rs.PathParam(value = "note")
java.lang.String note, java.util.Date d) {
    return this.bigDataController.addDateNote(tag, note, d);
}