@java.lang.Override
public greycat.struct.DMatrix init(int rows, int columns) {
    if ((rows != (_nbRows)) && (columns != (_nbMaxColumn))) {
        throw new java.lang.RuntimeException("Bad API usage !");
    }
    _nbMaxColumn = columns;
    _nbColumns = columns;
    this._data = new double[(_nbRows) * (_nbMaxColumn)];
    return this;
}