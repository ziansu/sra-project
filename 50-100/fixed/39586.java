private void formatSourceRows(io.f8k.fleet.common.schema.TaskSchema schema) throws java.lang.Exception {
    java.lang.System.out.println(("Writing formatted records to disk at path: " + (outputFile.Path)));
    try (java.io.FileReader fr = new java.io.FileReader(outputFileRaw.Path)) {
        try (java.io.BufferedReader bufr = new java.io.BufferedReader(fr)) {
            java.lang.String line;
            while ((line = bufr.readLine()) != null) {
                writeRowInTargetFile(schema, line);
            } 
        }
    }
}