public java.util.Map<java.lang.String, org.openml.apiconnector.xml.Run.Data.File> getOutputFileAsMap() {
    java.util.Map<java.lang.String, org.openml.apiconnector.xml.Run.Data.File> result = new java.util.TreeMap<java.lang.String, org.openml.apiconnector.xml.Run.Data.File>();
    if ((output_data) != null) {
        for (org.openml.apiconnector.xml.Run.Data.File f : output_data.file) {
            result.put(f.name, f);
        }
    }
    return result;
}