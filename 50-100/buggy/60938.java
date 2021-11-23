public void uTranspose() {
    double[] buffer = new double[(rows) * (columns)];
    pt.it.av.atnog.utils.bla.Matrix.transpose(data, buffer, rows, columns, pt.it.av.atnog.utils.bla.Matrix.BLK);
    this.data = buffer;
    int t = rows;
    this.rows = columns;
    this.columns = t;
}