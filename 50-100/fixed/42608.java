public static java.util.ArrayList<old.game.activatables.Effetto> nomeEffettoToArrayEffetti(java.lang.String nomeEffetto) {
    java.util.ArrayList<old.game.activatables.Effetto> effetti = new java.util.ArrayList<old.game.activatables.Effetto>();
    for (old.game.activatables.Effetti e1 : old.game.activatables.Effetti.values()) {
        if (nomeEffetto.equals(e1.getCategoriaEffetto())) {
            effetti.add(new old.game.activatables.Effetto(e1, null));
        }
    }
    return effetti;
}