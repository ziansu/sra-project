private void loadFile(java.lang.String fn) {
    try {
        java.io.FileReader fileReader = new java.io.FileReader(fn);
        java.io.BufferedReader bufferedReader = new java.io.BufferedReader(fileReader);
        java.lang.String str = null;
        int i = 0;
        while ((str = bufferedReader.readLine()) != null) {
            tblNames.setValueAt(str, (i++), 1);
        } 
    } catch (java.io.IOException e) {
        java.lang.System.out.println((("Unable to open file '" + fn) + "'"));
    }
}