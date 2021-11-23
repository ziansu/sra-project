private static void doPermutaciones(java.lang.String prefijo, java.lang.String cadena) {
    int n = cadena.length();
    if (n == 0) {
        euler.comunes.Helpers.permus.add(prefijo);
    }else {
        for (int i = 0; i < n; i++) {
            euler.comunes.Helpers.doPermutaciones((prefijo + (cadena.charAt(i))), ((cadena.substring(0, i)) + (cadena.substring((i + 1)))));
        }
    }
}