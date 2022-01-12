public boolean isEditable() {
    if ((isEditable) == null) {
        switch (getWPUmsatzArt()) {
            case Payout :
            case DivIn :
            case OthrInc :
            case IntrInc :
            case Ausgabe :
                isEditable = true;
                break;
            case Verkauf :
            case WP_Entnahme :
                isEditable = checkDeleteSharesOut();
                break;
            case Kauf :
            case WP_Einlage :
            case Retshrs :
                isEditable = checkDeleteSharesIn();
                break;
            default :
                isEditable = false;
        }
    }
    return isEditable;
}