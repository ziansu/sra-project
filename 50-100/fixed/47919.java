@java.lang.Override
public java.util.List<cdio.dal.dto.ProduktBatchDTO> getProduktBatchList() throws cdio.dal.dao.interfaces.DALException {
    java.util.List<cdio.dal.dto.ProduktBatchDTO> list = new java.util.ArrayList<cdio.dal.dto.ProduktBatchDTO>();
    try {
        java.sql.ResultSet rs = cdio.dal.connection.Connector.getInstance().doQuery("SELECT * FROM produktbatch");
        while (rs.next()) {
            list.add(new cdio.dal.dto.ProduktBatchDTO(rs.getInt("pb_id"), rs.getInt("recept_id"), rs.getString("status")));
        } 
    } catch (java.lang.Exception e) {
        throw new cdio.dal.dao.interfaces.DALException(e);
    }
    return list;
}