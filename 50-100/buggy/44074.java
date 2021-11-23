public void writeToFile(org.json.simple.JSONObject json) throws java.io.IOException {
    java.lang.System.out.println(json);
    java.io.FileWriter fw = new java.io.FileWriter("E:\\positive.json", true);
    java.io.BufferedWriter bw = new java.io.BufferedWriter(fw);
    bw.write(json.toJSONString());
    bw.write("\n");
    bw.close();
}