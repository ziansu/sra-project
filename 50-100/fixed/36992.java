public static void jeu() {
    int score = 0;
    if ((pendu.joueurs) == 1) {
        score = pendu.UnJoueur();
        if (profilGestion.existe()) {
            pendu.ajouteScore(score);
            profilGestion.saveProfil();
        }
    }else
        if ((pendu.joueurs) == 2) {
            score = pendu.choix2Jr();
            if (profilGestion.existe()) {
                pendu.ajouteScore(score);
                profilGestion.saveProfil();
            }
        }
    
}