public boolean equalsMots(java.lang.String mot1) {
    setNewBufferedReader();
    java.lang.String mot2;
    java.io.File f = new java.io.File(filename);
    for (int i = 0; i < (f.length()); i++) {
        mot2 = lire(i);
        if (mot1.equals(mot2)) {
            return false;
        }
    }
    return true;
}