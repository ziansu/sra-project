@java.lang.Override
public byte getErrorCellValue() {
    switch (_cellType) {
        case ERROR :
            return ((org.apache.poi.hssf.record.BoolErrRecord) (_record)).getErrorValue();
        case FORMULA :
            break;
        default :
            throw org.apache.poi.hssf.usermodel.HSSFCell.typeMismatch(CellType.ERROR, _cellType, false);
    }
    org.apache.poi.hssf.record.FormulaRecord fr = ((org.apache.poi.hssf.record.aggregates.FormulaRecordAggregate) (_record)).getFormulaRecord();
    org.apache.poi.hssf.usermodel.HSSFCell.checkFormulaCachedValueType(CellType.ERROR, fr);
    return ((byte) (fr.getCachedErrorValue()));
}