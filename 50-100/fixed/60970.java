public jmri.Turnout getOutput(int colnum) {
    if ((colnum > 0) && (colnum <= (outputsToBeans.size()))) {
        return outputsToBeans.get(("output" + colnum)).getBean();
    }else {
        jmri.implementation.MatrixSignalMast.log.error((("Trying to read output " + colnum) + " which has not been configured"));
    }
    return null;
}