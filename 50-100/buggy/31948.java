public smile.data.AttributeDataset parse(java.lang.String name, smile.data.Attribute[] attributes, java.io.File file) throws java.io.IOException, java.text.ParseException {
    smile.data.AttributeDataset data = new smile.data.AttributeDataset(name, attributes, response);
    try (java.io.BufferedReader reader = new java.io.BufferedReader(new java.io.InputStreamReader(new java.io.FileInputStream(file)))) {
        parse(data, reader);
    }
    return data;
}