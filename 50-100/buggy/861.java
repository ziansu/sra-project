@com.fasterxml.jackson.annotation.JsonProperty(value = "LastSale")
public void setLastSale(java.lang.String lastSale) {
    try {
        this.lastSale = new java.math.BigDecimal(lastSale).setScale(2, java.math.RoundingMode.HALF_UP);
    } catch (java.lang.NumberFormatException e) {
        java.lang.System.out.println(("lastSale string: " + lastSale));
        e.printStackTrace();
    }
}