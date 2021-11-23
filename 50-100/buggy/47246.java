public void calcular() {
    int res;
    for (int i = 0; i < (n.length); i++) {
        res = Truncar(n[i], n.length);
        suit.acomodar(n[i], res);
        java.lang.System.out.println(((("id: " + res) + " valor: ") + (n[i])));
    }
}