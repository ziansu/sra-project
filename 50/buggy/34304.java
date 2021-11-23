public int getNbLignes(int emplacement) {
    if (isCaisse())
        return -1;
    
    try {
        return listePartie.get(emplacement).getRowSize();
    } catch (java.lang.IndexOutOfBoundsException aiiobe) {
        return -1;
    }
}