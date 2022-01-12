private boolean checkSizePrices(domain.form.SizePriceForm sizePriceForm) {
    boolean result;
    result = true;
    if (((((sizePriceForm.getPriceS()) == null) && ((sizePriceForm.getPriceM()) == null)) && ((sizePriceForm.getPriceL()) == null)) && ((sizePriceForm.getPriceXL()) == null)) {
        result = false;
    }
    return result;
}