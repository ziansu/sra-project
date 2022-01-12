public void exportIndividualJSON(int position) throws java.io.FileNotFoundException, java.io.UnsupportedEncodingException {
    core.JSONGenerator jsonGen = new core.JSONGenerator();
    java.lang.String json = jsonGen.individualGenerator(bag, selectedNode, phaseHistory, markovNodes, position, probMarkov, done, attack);
    java.io.PrintWriter writer = new java.io.PrintWriter(((((props.getBagVisualizatorPathValue()) + "/public/datos") + position) + ".json"), "UTF-8");
    writer.println(json);
    writer.close();
}