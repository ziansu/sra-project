public java.lang.String[] readRow() {
    java.lang.String line = null;
    try {
        line = br.readLine();
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
    if (line == null)
        return null;
    
    java.lang.String[] record = line.split(((delimiter) + "(?=([^\"]*\"[^\"]*\")*[^\"]*$)"));
    return record;
}