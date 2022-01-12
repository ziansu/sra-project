public void run() {
    while ((((t) < (tf)) || ((nProf) > 0)) || ((nAlu) > 0)) {
        int j = indexOfMin(tps);
        if ((tpll) <= (tps.get(j))) {
            llegada();
        }else {
            salida(j);
        }
        if ((t) >= (tf)) {
            tpll = hv;
        }
    } 
    calcularResultados();
}