@javax.ws.rs.GET
@javax.ws.rs.Path(value = "/")
public java.lang.String getNotes() {
    java.lang.String ret = "";
    try {
        java.util.List<fr.nikk.model.note.Note> ln = this.dao.getData();
        try {
            return this.mapper.writeValueAsString(ln);
        } catch (com.fasterxml.jackson.core.JsonProcessingException e) {
            ret = "jdb error :\n";
            ret += e.getMessage();
            return ret;
        }
    } catch (fr.nikk.services.couchdb.repository.UnimplementedOperationException e) {
        e.printStackTrace();
        return ret;
    }
}