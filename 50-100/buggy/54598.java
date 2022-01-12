public java.lang.String getOutputName(int colnum) {
    if ((colnum > 0) && (colnum <= 5)) {
        return outputsToBeans.get(("output" + colnum)).getName();
    }
    jmri.implementation.MatrixSignalMast.log.error((("Trying to read output " + colnum) + " which has not been configured"));
    return "";
}