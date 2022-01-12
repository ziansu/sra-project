private java.util.ArrayList<java.lang.String> getDateParts() {
    java.util.ArrayList<java.lang.String> dateParts = new java.util.ArrayList<java.lang.String>();
    if ((this.agg_lev) != "Default (ALL)")
        dateParts.add("Year");
    
    if (((this.agg_lev) == "Month") || ((this.agg_lev) == "Day"))
        dateParts.add("Month");
    
    if ((this.agg_lev) == "Day")
        dateParts.add("Day");
    
    return dateParts;
}