private static void diskFiles(com.fasterxml.jackson.core.JsonParser parser, java.util.ArrayList<merger.data.Json> good) throws java.io.IOException {
    while (!(JsonToken.END_ARRAY.equals(parser.nextToken()))) {
        java.io.File file = new java.io.File(parser.getValueAsString());
        if (file.isDirectory()) {
            merger.data.Json json = merger.data.Json.loadDiskFile(parser.getValueAsString());
            merger.processes.ConfigurationFile.checkJson(json, good);
        }else
            merger.processes.ConfigurationFile.loadDirectory(parser.getValueAsString(), good);
        
    } 
}