public double calcular(double valor_inicial, double tolerancia) {
    Derivador df = new Derivador(f);
    double error = 50;
    while (error > tolerancia) {
        valor_inicial = valor_inicial - ((f.Funcion(valor_inicial)) / (df.derivar(valor_inicial, tolerancia)));
        error = java.lang.Math.abs(f.Funcion(valor_inicial));
    } 
}