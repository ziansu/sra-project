public it.unibs.fancyworld.game.EsitoMovimento eseguiMovimento(int direzioneMovimento) {
    try {
        it.unibs.fancyworld.game.Luogo nuovoLuogoCorrente = luogoCorrente.percorriPassaggio(direzioneMovimento);
        if (!(nuovoLuogoCorrente.equals(luogoCorrente))) {
            luogoCorrente = nuovoLuogoCorrente;
            return EsitoMovimento.OK;
        }else {
            it.unibs.fancyworld.game.EsitoMovimento esito = EsitoMovimento.PASSAGGIO_NON_ATTRAVERSABILE;
            esito.setCausa(luogoCorrente.getStatoPassaggio(direzioneMovimento).toString());
            return esito;
        }
    } catch (it.unibs.fancyworld.game.PassaggioNonEsistenteException e) {
        return EsitoMovimento.PASSAGGIO_NON_ESISTENTE;
    }
}