public void loop(boolean prox) throws java.io.IOException {
    java.lang.String linha = entradaString.readLine();
    if (linha == null) {
        interfac2.setFim(false);
        entradaString.close();
    }else {
        unit.decode(linha);
    }
}