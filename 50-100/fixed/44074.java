public void writeToFile(org.json.simple.JSONObject json, java.lang.String filePath) throws java.io.IOException {
    java.io.FileWriter fw = new java.io.FileWriter(filePath, true);
    java.io.BufferedWriter bw = new java.io.BufferedWriter(fw);
    bw.write(json.toJSONString());
    bw.write("\n");
    bw.close();
}