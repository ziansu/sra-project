public ezvcard.VCard getVCard() {
    java.lang.String str = getCard();
    ezvcard.VCard vCard = null;
    if (com.liferay.portal.kernel.util.Validator.isNotNull(str)) {
        vCard = ezvcard.Ezvcard.parse(str).first();
    }else {
        vCard = new ezvcard.VCard();
    }
    return vCard;
}