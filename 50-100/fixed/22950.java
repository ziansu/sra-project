@java.lang.Override
public void updateProduktBatch(dto01917.ProduktBatchDTO produktbatch) throws daointerfaces01917.DALException {
    try {
        connector.doUpdate(((("UPDATE produktbatch SET  status = " + (produktbatch.getStatus())) + "  WHERE pb_id = ") + (produktbatch.getPbId())));
    } catch (java.sql.SQLException e) {
        e.printStackTrace();
    }
}