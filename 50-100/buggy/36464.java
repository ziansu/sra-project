private java.lang.String readCompleteRessourceAsString(java.lang.String resource) throws java.io.IOException {
    java.io.InputStream inStream = edu.stanford.rsl.tutorial.motion.compensation.OpenCLMotionCompensatedBackProjector.class.getResourceAsStream(resource);
    java.io.BufferedReader br = new java.io.BufferedReader(new java.io.InputStreamReader(inStream));
    java.lang.String content = "";
    java.lang.String line = br.readLine();
    while (line != null) {
        content += line + "\n";
        line = br.readLine();
    } 
    return content;
}