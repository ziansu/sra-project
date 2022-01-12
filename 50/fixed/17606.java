@java.lang.Override
public java.util.List<dtu.cdio_final.shared.dto.FormulaCompDTO> getFormulaComps(int formulaID) {
    java.util.List<dtu.cdio_final.shared.dto.FormulaCompDTO> result = null;
    try {
        result = formulaCompDao.getFormulaCompList(formulaID);
    } catch (dtu.cdio_final.server.dal.daointerfaces.DALException e) {
        e.printStackTrace();
    }
    return result;
}