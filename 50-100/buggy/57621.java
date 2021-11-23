public static void option2() {
    java.lang.System.out.println("Mode 1 ou 2 Joueurs ?");
    plusMoins.joueurs = InOut.getByte();
    if (((plusMoins.joueurs) != 1) || ((plusMoins.joueurs) != 2)) {
        plusMoins.joueurs = 1;
    }
    java.lang.System.out.println((("Vous etes actuellement en mode " + (plusMoins.joueurs)) + " joueurs"));
}