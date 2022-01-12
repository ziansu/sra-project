public it.ccse.uscite.domain.StatoFideiussione.FideiussionePratica getFideiussionePraticaByCT(java.math.BigInteger idComponenteTariffaria) {
    it.ccse.uscite.domain.StatoFideiussione.FideiussionePratica fideiussione = null;
    if (UsciteProperties.LISTA_COMPONENTI_TARIFFARIE_FIDEIUSSIONE.contains(idComponenteTariffaria)) {
        switch (this) {
            case ASSENTE :
                fideiussione = it.ccse.uscite.domain.StatoFideiussione.FideiussionePratica.ASSENTE;
                break;
            case PRESENTE :
                fideiussione = it.ccse.uscite.domain.StatoFideiussione.FideiussionePratica.PRESENTE;
                break;
            case UNDEFINED :
                fideiussione = it.ccse.uscite.domain.StatoFideiussione.FideiussionePratica.UNDEFINED;
                break;
            default :
                break;
        }
    }else {
        fideiussione = it.ccse.uscite.domain.StatoFideiussione.FideiussionePratica.DONT_CARE;
    }
    return fideiussione;
}