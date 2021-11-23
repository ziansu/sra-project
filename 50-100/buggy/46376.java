public void writeFile(java.lang.String filename, java.lang.String reportText) throws a00892244.utils.ApplicationException {
    try {
        output = new java.util.Formatter(filename);
    } catch (java.io.FileNotFoundException e) {
        throw new a00892244.utils.ApplicationException(e.getMessage());
    }
    output.format(reportText);
    if ((output) != null) {
        try {
            output.close();
        } catch (java.lang.Exception e) {
            throw new a00892244.utils.ApplicationException(e.getMessage());
        }
    }
}