@java.lang.Override
public ie.cmrc.tabular.TableCell getCell(ie.cmrc.util.Term field) {
    if (((this.header) != null) && ((this.row) != null)) {
        java.lang.Integer index = this.header.getValue(field);
        if (index != null)
            return new ie.cmrc.tabular.excel.ExcelTableCell(this.row.getCell(index));
        
    }
    return new ie.cmrc.tabular.excel.ExcelTableCell(null);
}