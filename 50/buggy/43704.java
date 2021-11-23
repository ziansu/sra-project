public java.util.ArrayList<com.qa.smurf.entities.LineItems> getLineItems() {
    java.util.ArrayList<com.qa.smurf.entities.LineItems> lineitems = new java.util.ArrayList<com.qa.smurf.entities.LineItems>();
    try {
        lineitems = initialData.getLineItems();
    } catch (java.text.ParseException pe) {
        java.lang.System.err.println();
    }
    return lineitems;
}