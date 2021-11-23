public static void sendToHMM(java.lang.String typeAtt) {
    java.io.PrintWriter writer;
    try {
        writer = new java.io.PrintWriter(new java.io.BufferedWriter(new java.io.FileWriter("./events.hmm", true)));
        java.lang.String[] cve = main.Main.CVEMAP.get(typeAtt).split("/");
        writer.println(((("CVE=" + (cve[0])) + ";Severity=") + (cve[1])));
        writer.close();
    } catch (java.lang.Exception ex) {
        java.lang.System.err.println(ex);
    }
}