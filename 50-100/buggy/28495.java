@java.lang.Override
public void updateFormula(dto.FormulaDTO formula) throws daointerfaces.DALException {
    try {
        ps = connector.Connector.prepare("UPDATE formula SET formula_name = ? WHERE formula_id = ?");
        ps.setString(1, formula.getFormulaName());
        ps.setInt(2, formula.getFormulaID());
    } catch (java.sql.SQLException e) {
        throw new daointerfaces.DALException(e);
    }
}