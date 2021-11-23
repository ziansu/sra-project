@java.lang.Override
public Model.BasicCell next() {
    if ((count) < ((COLUMN) * (ROW))) {
        Model.BasicCell bc = ((Model.BasicCell) (mArrayCells[count]));
        (count)++;
        return bc;
    }
    throw new java.util.NoSuchElementException();
}