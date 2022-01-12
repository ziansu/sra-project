public static boolean fichierExiste() {
    java.io.BufferedReader bF = null;
    boolean bon = false;
    try {
        bF = new java.io.BufferedReader(new java.io.FileReader(((profilGestion.name) + ".sav")));
        bon = true;
    } catch (java.io.FileNotFoundException e) {
        bon = false;
    } finally {
        try {
            if (bon == true)
                bF.close();
            
        } catch (java.io.IOException e) {
        }
    }
    return bon;
}