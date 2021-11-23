public void runbat() {
    java.lang.String path = "D:\\tools\\enjarify-master\\enjarify.bat";
    java.lang.Runtime run = java.lang.Runtime.getRuntime();
    try {
        java.lang.Process process = run.exec(("cmd.exe /k start " + path));
        java.io.InputStream in = process.getInputStream();
        while ((in.read()) != (-1)) {
        } 
        in.close();
        process.waitFor();
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}