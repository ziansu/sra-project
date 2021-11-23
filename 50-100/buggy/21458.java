public void run(JSONRunner runner, int count) throws java.io.IOException {
    JSON json = runner.getParser().parseInput(next);
    java.io.FileWriter output = new java.io.FileWriter((("output" + count) + ".json"));
    output.write(json.toString());
    output.close();
}