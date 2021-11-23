public static void SchreibeWarnung(java.util.ArrayList Warnungen) {
    try {
        java.io.FileWriter fw = new java.io.FileWriter("Warnungen.txt");
        for (int i = 0; i < (Warnungen.size()); i++) {
            fw.write(("" + (Warnungen.get(i))));
            fw.write(java.lang.System.getProperty("line.separator"));
        }
        fw.flush();
        fw.close();
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}