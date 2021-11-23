public void melt() {
    gv.setFreeze(true);
    switch (gv.getLanguage()) {
        case GERMAN :
            p.sendMessage(((AdminWerkzeugeMain.prefixDE) + "�bDu hast die Spieler aufgetaut."));
            break;
        case ENGLISH :
            p.sendMessage(((AdminWerkzeugeMain.prefixEN) + "�bYou disabled freeze."));
            break;
    }
}