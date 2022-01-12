public static void sendToHMM(java.lang.String typeAtt) {
    java.io.PrintWriter writer;
    try {
        writer = new java.io.PrintWriter("./events.hmm", "UTF-8");
        java.lang.String[] cve = main.Main.CVEMAP.get(typeAtt).split("/");
        writer.println(((("CVE=" + (cve[0])) + ";Severity=") + (cve[1])));
        writer.close();
    } catch (java.lang.Exception ex) {
        java.lang.System.err.println(ex);
    }
}