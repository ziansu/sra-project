public int Truncar(int clave) {
    int tama = n.length;
    int digitos = calculaD(clave);
    int id = GeneraId(clave, digitos, tama);
    return id;
}