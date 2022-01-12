public boolean ehPalindromo(java.lang.String frase) {
    java.lang.String fraseFiltrada = frase.toUpperCase().replace(" ", "").replace("-", "");
    for (int i = 0; i < (fraseFiltrada.length()); i++) {
        if ((fraseFiltrada.charAt(i)) != (fraseFiltrada.charAt(((fraseFiltrada.length()) - i)))) {
            return false;
        }
    }
    return true;
}