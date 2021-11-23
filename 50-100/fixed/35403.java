protected void runCommandVerbose(java.lang.String command) {
    java.lang.Runtime r = java.lang.Runtime.getRuntime();
    java.lang.Process p;
    try {
        p = r.exec(command);
        p.waitFor();
        java.io.BufferedReader b = new java.io.BufferedReader(new java.io.InputStreamReader(p.getInputStream()));
        java.lang.String line = "";
        while ((line = b.readLine()) != null) {
            java.lang.System.out.print(line);
        } 
    } catch (java.io.IOException | java.lang.InterruptedException e) {
        e.printStackTrace();
    }
}