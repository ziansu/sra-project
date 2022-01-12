public static void main(java.lang.String[] args) {
    functions.Truncamiento a = new functions.Truncamiento();
    int res;
    java.lang.System.out.println("Bienvenido");
    for (int i = 0; i < (a.n.length); i++) {
        res = a.Truncar(a.n[i]);
        java.lang.System.out.println(((("id: " + res) + " valor: ") + (a.n[i])));
    }
}