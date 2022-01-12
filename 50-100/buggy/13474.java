private boolean checkColumnNames(final org.apache.poi.ss.usermodel.Row row) {
    for (int i = 0; i < (com.nagarro.gde.persistence.model.enums.EligoExcelEnum.values().length); i++) {
        if (!(row.getCell(i).toString().equals(com.nagarro.gde.persistence.model.enums.EligoExcelEnum.getEnumFromIndex(i).getDisplayVal()))) {
            return false;
        }
    }
    return true;
}