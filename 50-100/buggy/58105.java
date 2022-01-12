public static boolean testsUnitaires(Vecteur unO, Vecteur unV) {
    Vecteur v = unO.ajouter(unV);
    java.lang.System.out.println(((((unO + " + ") + unV) + " == ") + v));
    v = v.retirer(unV);
    java.lang.System.out.println(((((v + " - ") + unV) + " == ") + v));
    return v.comparer(unO);
}