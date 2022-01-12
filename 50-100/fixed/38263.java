public void loop(boolean prox) throws java.io.IOException {
    java.lang.String linha = entradaString.readLine();
    if (linha == null) {
        interfac2.setFim(false);
        entradaString.close();
    }else {
        if (prox) {
            while (linha != null) {
                unit.decode(linha);
                linha = entradaString.readLine();
            } 
            entradaString.close();
            interfac2.setFim(false);
        }else
            unit.decode(linha);
        
    }
}