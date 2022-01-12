@org.junit.Test(expected = ar.fiuba.tdd.grupo10.nikoligames.exceptions.WrongNumberOfGridCellsException.class)
public void buildGridWithIncorrectRowNumber() throws ar.fiuba.tdd.grupo10.nikoligames.exceptions.WrongNumberOfGridCellsException {
    new ar.fiuba.tdd.grupo10.nikoligames.grid.GridBuilder().setRows(5).setColumns(2).addCells(flattenCells).buildGrid();
}