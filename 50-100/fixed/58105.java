public static boolean testsUnitaires(Vecteur unO, Vecteur unV) {
    Vecteur v = unO.ajouter(unV);
    java.lang.System.out.println(((((unO + " + ") + unV) + " == ") + v));
    java.lang.System.out.print((((v + " - ") + unV) + " == "));
    v = v.retirer(unV);
    java.lang.System.out.println(v);
    return v.comparer(unO);
}