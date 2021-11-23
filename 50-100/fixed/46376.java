public void writeFile(java.lang.String filename, java.lang.String text) throws a00892244.utils.ApplicationException {
    java.lang.System.out.println(text);
    try {
        output = new java.util.Formatter(filename);
    } catch (java.io.FileNotFoundException e) {
        throw new a00892244.utils.ApplicationException(e.getMessage());
    }
    output.format(text);
    if ((output) != null) {
        try {
            output.close();
        } catch (java.lang.Exception e) {
            throw new a00892244.utils.ApplicationException(e.getMessage());
        }
    }
}