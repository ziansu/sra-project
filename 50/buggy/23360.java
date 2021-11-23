public int Truncar(int clave, int tama) {
    int digitos = calculaD(clave);
    int id = GeneraId(clave, digitos, tama);
    return id;
}