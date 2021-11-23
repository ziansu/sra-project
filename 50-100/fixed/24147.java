public static void ReadMovieParameter(java.lang.String filepath) {
    java.io.BufferedReader br = null;
    java.lang.String strLine = "";
    try {
        br = new java.io.BufferedReader(new java.io.FileReader(filepath));
        while ((strLine = br.readLine()) != null) {
            eu.ooti.forumlite.String_show.string_show(strLine);
            java.lang.Thread.sleep(2000);
        } 
    } catch (java.lang.Exception e) {
    }
}