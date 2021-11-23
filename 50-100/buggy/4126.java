java.lang.String content_file(java.lang.String pth) {
    java.lang.String thisLine;
    java.lang.String str_words = "";
    if (new java.io.File(pth).canExecute()) {
        try {
            java.io.BufferedReader br = new java.io.BufferedReader(new java.io.InputStreamReader(new java.io.FileInputStream(pth), "windows-1251"));
            while ((thisLine = br.readLine()) != null) {
                str_words += thisLine;
            } 
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }
    return str_words;
}