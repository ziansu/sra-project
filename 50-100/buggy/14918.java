public static java.util.List<io.github.malapert.jwcs.proj.gui.MapLine> importData(java.io.InputStream inputStream) throws java.io.IOException {
    java.util.List<io.github.malapert.jwcs.proj.gui.MapLine> lines = new java.util.ArrayList<>();
    try (java.io.BufferedReader in = new java.io.BufferedReader(new java.io.InputStreamReader(inputStream))) {
        java.lang.String idStr;
        while ((idStr = in.readLine()) != null) {
            io.github.malapert.jwcs.proj.gui.MapLine line = io.github.malapert.jwcs.proj.gui.UngenerateImporter.readLine(in);
            if (line != null) {
                lines.add(line);
            }
        } 
    }
    return lines;
}