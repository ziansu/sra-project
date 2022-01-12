private boolean matchOr(com.onpositive.text.analysis.IToken token) {
    if ((euristics) == null)
        return true;
    
    for (com.onpositive.text.analisys.Euristic eur : euristics)
        if (eur.match(token))
            return true;
        
    
    return false;
}