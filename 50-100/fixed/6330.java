public Model.BasicCell getCell(java.lang.String celltype, int row, int col) throws Exception.CellException {
    Model.BasicCell cell = null;
    switch (celltype) {
        case Model.CellFactory.GAMEOFLIFE :
            cell = new Cell.LifeCell(row, col);
            break;
        case Model.CellFactory.WATOR :
            cell = new Cell.WatorCell(row, col);
            break;
        default :
            throw new Exception.CellException("TypeNotFound");
    }
    return cell;
}