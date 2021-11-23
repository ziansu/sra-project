private napakalaki.Treasure giveMeATreasure() {
    napakalaki.Random rnd = new napakalaki.Random();
    int numero;
    numero = ((int) (((rnd.nextDouble()) * (hiddenTreasures.size())) + 0));
    napakalaki.Treasure aux = hiddenTreasures.get(numero);
    hiddenTreasures.remove(numero);
    return aux;
}