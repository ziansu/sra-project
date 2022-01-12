public static void ReadMovie() {
    java.io.BufferedReader br = null;
    java.lang.String strLine = "";
    try {
        br = new java.io.BufferedReader(new java.io.FileReader("\\files\\Movie1.txt"));
        while ((strLine = br.readLine()) != null) {
            java.lang.System.out.println(strLine);
            eu.ooti.forumlite.String_show.string_show(strLine);
            java.lang.Thread.sleep(2000);
        } 
    } catch (java.lang.Exception e) {
    }
}