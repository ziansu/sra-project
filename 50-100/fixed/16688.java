public void addObservations(double[][] data) {
    this.data = infodynamics.utils.MatrixUtils.transpose(data);
    this.dimensions = this.data[0].length;
    this.totalObservations = this.data.length;
    if ((dimensions) > (totalObservations)) {
        java.lang.System.out.printf(("The number of dimensions is smaller than the number" + " of observations. You're probably doing something wrong."));
    }
}