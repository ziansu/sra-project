public static java.util.ArrayList<jeu.Calcul> generateList2(int size, int max) {
    java.util.ArrayList<jeu.Calcul> liste = new java.util.ArrayList<jeu.Calcul>(size);
    for (int i = 0; i < size; i++) {
        jeu.Calcul test = new jeu.Calcul(max);
        while ((test.getResultat("-")) <= 0) {
            test = new jeu.Calcul();
        } 
        liste.add(test);
    }
    return liste;
}