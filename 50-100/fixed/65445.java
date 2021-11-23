protected int getPref(java.util.List<java.lang.String> valeur) {
    for (int i = 0; i < ((nbMod) - 1); i++)
        if (ordrePref.get(i).equals(valeur))
            return i;
        
    
    assert ordrePref.get(((nbMod) - 1)).equals(valeur);
    return (nbMod) - 1;
}