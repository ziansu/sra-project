public void writeGraphvizFile(java.lang.String filename) throws java.io.IOException {
    ac.at.tuwien.infosys.visp.topologyParser.antlr.listener.TopologyListener.logger.info(("in writeGraphvizFile for filename " + filename));
    linesToWriteToGraphViz.add("\n}");
    try (java.io.Writer writer = new java.io.BufferedWriter(new java.io.OutputStreamWriter(new java.io.FileOutputStream(filename), "utf-8"))) {
        for (java.lang.String s : linesToWriteToGraphViz) {
            writer.write(("\t" + s));
        }
    }
    ac.at.tuwien.infosys.visp.topologyParser.antlr.listener.TopologyListener.logger.info(((("Wrote " + (linesToWriteToGraphViz)) + " to ") + filename));
}