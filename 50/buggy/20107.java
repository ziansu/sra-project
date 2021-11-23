@java.lang.Override
public void run() {
    for (java.lang.Integer mid : dinges.alleFilms()) {
        if (dinges.heeftRegisseur(mid)) {
            dinges.auteurVanFilm(mid);
        }
    }
}