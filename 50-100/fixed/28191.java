public int distance(compilateurHistorique.Instanciation other) {
    int out = 0;
    for (int i = 0; i < (dataset.vars.length); i++)
        if ((((values[i]) != null) && ((other.values[i]) != null)) && (!(values[i].equals(other.values[i]))))
            out++;
        
    
    return out;
}