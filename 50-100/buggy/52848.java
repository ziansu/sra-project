public void addRules(java.io.File file) {
    try {
        java.io.BufferedReader br = new java.io.BufferedReader(new java.io.InputStreamReader(new java.io.FileInputStream(file)));
        java.lang.String string;
        while ((string = br.readLine()) == null) {
            addRule(string);
        } 
        br.close();
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}