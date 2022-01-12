@java.lang.Override
public void reset() throws java.lang.Exception {
    this.au = true;
    for (int i1 = 0; i1 < (this.numberOfColumns); ++i1) {
        super.Cols(i1).a(0);
    }
    super._mthif(0);
    this.buildGrid();
}