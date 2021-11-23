@java.lang.Override
public cdio.dal.dto.ProduktBatchDTO getProduktBatch(int pbId) throws cdio.dal.dao.interfaces.DALException {
    try {
        java.sql.ResultSet rs = cdio.dal.connection.Connector.getInstance().doQuery("Select pb_id, status, recept_id FROM produktbatch WHERE pb_id = ?", pbId);
        if (!(rs.first()))
            throw new cdio.dal.dao.interfaces.DALException((("Produktbatchen" + pbId) + "findes ikke"));
        
        return new cdio.dal.dto.ProduktBatchDTO(rs.getInt("pb_id"), rs.getInt("recept_id"), rs.getString("status"));
    } catch (java.lang.Exception e) {
        throw new cdio.dal.dao.interfaces.DALException(e);
    }
}