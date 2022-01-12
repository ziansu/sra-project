public void receberFlecha() {
    double sorte = getNumeroSorte();
    if (sorte < 0)
        experiencia += 2;
    else
        if (sorte <= 100)
            perderVida();
        
    
}