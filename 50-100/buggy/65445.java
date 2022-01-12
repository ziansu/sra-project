protected int getPref(java.util.List<java.lang.String> valeur) {
    for (int i = 0; i < ((nbMod) - 1); i++)
        if (ordrePref.get(i).equals(valeur))
            return i;
        
    
    return (nbMod) - 1;
}