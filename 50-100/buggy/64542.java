public double getNumeroSorte() {
    double n = 101.0;
    if ((dataNascimento.ehBissexto()) && (((vida) >= 80) || ((vida) <= 90)))
        return n * (-33);
    else
        if ((!(dataNascimento.ehBissexto())) && (((nome) == "Seixas") || ((nome) == "Meireles")))
            return (n * 33) % 100;
        
    
    return n;
}