public double getNumeroSorte() {
    double n = 101.0;
    if ((dataNascimento.ehBissexto()) && (((vida) >= 80) || ((vida) <= 90)))
        return n * (-33);
    else
        if ((!(dataNascimento.ehBissexto())) && ((nome.equals("Seixas")) || (nome.equals("Meireles"))))
            return (n * 33) % 100;
        
    
    return n;
}