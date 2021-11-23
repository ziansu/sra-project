private napakalaki.Treasure giveMeATreasure() {
    java.util.Random rnd = new java.util.Random();
    int numero;
    numero = ((int) (((rnd.nextDouble()) * (hiddenTreasures.size())) + 0));
    napakalaki.Treasure aux = hiddenTreasures.get(numero);
    hiddenTreasures.remove(numero);
    return aux;
}