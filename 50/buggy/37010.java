public void setTextInMask(java.lang.String text) {
    if (!(maskedFormatterAttached)) {
        safeSetText(text);
    }else {
        detachMaskedFormatter();
        safeSetText(maskedFormatter.getFormattedValue(text));
        attachMaskedFormatter();
    }
}