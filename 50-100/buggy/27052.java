public boolean equalsMots(java.lang.String mot1) {
    setNewBufferedReader();
    java.lang.String mot2 = "";
    for (int i = 0; i < (length()); i++) {
        mot2 = lire(i);
        if (mot1.equals(mot2)) {
            return false;
        }
    }
    return true;
}