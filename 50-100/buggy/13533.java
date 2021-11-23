public static void main(java.lang.String[] args) {
    java.util.Scanner sc = new java.util.Scanner(java.lang.System.in);
    java.lang.System.out.println("Sélectionner le mode d'affichage:");
    java.lang.System.out.println("> Graphique (1)");
    java.lang.System.out.println("> Console (2)");
    int mode = sc.nextInt();
    if (mode == 1) {
        Graphique.main(args);
    }
    if (mode == 2) {
        Console.main(args);
    }
    sc.close();
}