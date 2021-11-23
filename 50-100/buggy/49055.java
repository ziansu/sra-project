private java.lang.Boolean showInDeliveryNote(se.lanteam.domain.CustomerGroup customerGroup, se.lanteam.domain.OrderCustomField orderCustomField) {
    for (se.lanteam.domain.CustomerCustomField customerCustomfield : customerGroup.getCustomerCustomFields()) {
        if (((customerCustomfield.getCustomField().getIdentification()) == (orderCustomField.getCustomField().getIdentification())) && ((customerCustomfield.getShowInDeliveryNote()) == true)) {
            return true;
        }
    }
    return false;
}