public int getNbLignes(int emplacement) {
    if (isCaisse())
        return -1;
    
    return listePartie.get(emplacement).getRowSize();
}