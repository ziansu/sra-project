public boolean isDeleteable() {
    if ((isDeleteable) == null) {
        de.aw.enums.WPUmsatzArt umsatzArt = getWPUmsatzArt();
        switch (umsatzArt) {
            case DivIn :
            case OthrInc :
            case IntrInc :
            case Ausgabe :
            case Payout :
                isDeleteable = true;
                break;
            case Kauf :
            case WP_Einlage :
            case Retshrs :
                isDeleteable = checkDeleteSharesIn();
                break;
            case WP_Splitt :
                isDeleteable = checkSplittedShares();
                break;
            case Verkauf :
            case WP_Entnahme :
                isDeleteable = checkDeleteSharesOut();
                break;
        }
    }
    return isDeleteable;
}