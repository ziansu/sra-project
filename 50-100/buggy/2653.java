public static java.util.ArrayList<jeu.Calcul> generateList(int size) {
    java.util.ArrayList<jeu.Calcul> liste = new java.util.ArrayList<jeu.Calcul>(size);
    for (int i = 0; i < size; i++) {
        jeu.Calcul test = new jeu.Calcul();
        while ((test.getResultat("-")) < 0) {
            test = new jeu.Calcul();
        } 
        liste.add(test);
    }
    return liste;
}