private java.lang.String getChargeRangeAsString() {
    java.lang.String charges = "";
    for (int i = minCharge; i < (maxCharge); i++) {
        if (!(charges.isEmpty())) {
            charges += ",";
        }
        charges += i + "+";
    }
    return charges;
}